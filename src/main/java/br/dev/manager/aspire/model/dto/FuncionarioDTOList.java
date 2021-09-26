package br.dev.manager.aspire.model.dto;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDTOList<T> {

	private List<T> funcionarios;

	public FuncionarioDTOList(List<T> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public FuncionarioDTOList() {
		 funcionarios = new ArrayList<>();
	}

	public List<T> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<T> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
