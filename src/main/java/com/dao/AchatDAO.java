package com.dao;

import java.util.List;

import com.entity.Achat;

public interface AchatDAO {
	public List<Achat> listAchat();
	
	public List<Achat> listAchat(int limit);

}