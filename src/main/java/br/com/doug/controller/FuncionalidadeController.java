package br.com.doug.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.doug.as.FuncionalidadeAS;
import br.com.doug.vo.FuncionalidadeVO;

public class FuncionalidadeController{

	private FuncionalidadeAS funcionalidadeAS;
	
	public List<FuncionalidadeVO> pesquisaFuncionalidades(){
		List<FuncionalidadeVO> lista = funcionalidadeAS.pesquisaFuncionalidades();
		return lista;
	}
	
}