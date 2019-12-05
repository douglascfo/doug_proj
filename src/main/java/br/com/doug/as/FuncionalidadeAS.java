package br.com.doug.as;

import java.util.ArrayList;
import java.util.List;

import br.com.doug.dao.FuncionalidadeDAO;
import br.com.doug.dao.model.Funcionalidade;
import br.com.doug.vo.FuncionalidadeVO;

public class FuncionalidadeAS{

	private FuncionalidadeDAO dao = new FuncionalidadeDAO();
	
	public List<FuncionalidadeVO> pesquisaFuncionalidades() {
		List<Funcionalidade> lista = dao.buscarFuncionalidades();
		List<FuncionalidadeVO> listaVO = converteVO(lista);
		return listaVO;
	}
		
	public List<FuncionalidadeVO> converteVO(List<Funcionalidade> lista){
		List<FuncionalidadeVO> listaVO = new ArrayList<>();
		for(Funcionalidade funcionalidade : lista){
			FuncionalidadeVO vo = new FuncionalidadeVO();
			vo.setNome(funcionalidade.getNome());
			vo.setDescricao(funcionalidade.getDescricao());
			listaVO.add(vo);
		}
		return listaVO;
	}
	
}