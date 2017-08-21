package com.web.iso16100;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

@RestController
@RequestMapping("/iso16100")
public class ISO16100Controller {

	@RequestMapping(value = "/swagger", method = RequestMethod.POST)
	public @ResponseBody String getSwaggerContent(@RequestParam("file") MultipartFile file) {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		Document doc = null;
		try {

			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(file.getInputStream());

		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		doc.getDocumentElement().normalize();

		NodeList nList = doc.getElementsByTagName("ReferenceCapabilityClassStructure");

		Map<String, Object> data = new HashMap<String, Object>();
		StringBuilder sb = new StringBuilder();
		
		
		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);

		  sb.append("\n")
		    .append("swagger : '2.0'\n")
			.append("info: \n")
			.append("  title: ISO 16100 API\n")
			.append("  description : ISO 16100 Api\n")
			.append("  version : 1.0.0\n")
			
			.append("# the domain of the service\n")
			.append("host: localhost\n")
			.append("# array of all schemes that your API supports\n")
			.append("schemes:\n")
			.append("  - http\n")
			.append("# will be prefixed to all paths\n")
			.append("basePath: /v1\n")
			.append("produces:\n")
			.append("  - application/json\n")
			
			.append("paths: \n")
			.append("  /createAsset:\n")
			.append("    post:\n")
			.append("      summary: summary\n")
			.append("      description: |\n")
			.append("        description\n")
			
			.append("      parameters: \n")
			
			.append("        - name: name\n")
			.append("          in: query\n")
			.append("          description: name description\n")
			.append("          required: true\n")
			.append("          type: string\n")
			.append("          format: string\n")
			
			.append("        - name: modelName\n")
			.append("          in: query\n")
			.append("          description: modelName description\n")
			.append("          required: true\n")
			.append("          type: string\n")
			.append("          format: string\n")
			
			.append("        - name: ownerName\n")
			.append("          in: query\n")
			.append("          description: ownerName description\n")
			.append("          required: true\n")
			.append("          type: string\n")
			.append("          format: string\n")
			
			.append("      tags:\n")
			.append("        - createAsset\n")
			
			.append("      responses:\n")
			.append("        200:\n")
			.append("          description: objId description\n")
			.append("          schema:\n")
			.append("            type: array\n")
			.append("            items:\n")
			.append("              $ref: '#/definitions/objId'\n")
			.append("        default:\n")
			.append("          description: Unexpected error\n")
			.append("          schema:\n")
			.append("            $ref: '#/definitions/Error'\n")
			
			.append("definitions:\n")
			.append("  objId:\n")
			.append("    type: object\n")
			.append("    properties:\n")
			.append("      name:\n")
			.append("        type: string\n")
			.append("        description: name description\n")
			.append("      modelName:\n")
			.append("        type: string\n")
			.append("        description: modelName description\n")
			.append("      ownerName:\n")
			.append("        type: string\n")
			.append("        description: ownerName description\n")
			
			.append("  Error:\n")
			.append("    type: object\n")
			.append("    properties:\n")
			.append("      code:\n")
			.append("        type: integer\n")
			.append("        format: int32\n")
			.append("      message:\n")
			.append("        type: string\n")
			.append("      fields:\n")
			.append("        type: string\n");

		}

		return sb.toString();

	}
	
	@RequestMapping(value = "/swaggerFile", method = RequestMethod.POST)
	public void getSwaggerContentAsFile(@RequestParam("file") MultipartFile file, HttpServletResponse response) throws IOException {
		
		String content = getSwaggerContent(file);
		
		InputStream stream = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));

        response.setContentType("txt/plain");
        response.setHeader("Content-Disposition", "attachment; filename=specification.yaml");
        response.setHeader("Content-Length", String.valueOf(content.length()));
        FileCopyUtils.copy(stream, response.getOutputStream());
        response.flushBuffer();
	}

}
