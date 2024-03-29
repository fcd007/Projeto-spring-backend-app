package br.dev.manager.aspire.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.manager.aspire.excetion.ResourceNotFoundException;
import br.dev.manager.aspire.model.Funcionario;
import br.dev.manager.aspire.model.dto.FuncionarioDTOList;
import br.dev.manager.aspire.repository.FuncionarioRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	// listar funcionarios
	@GetMapping("/funcionarios/listar")
	public List<Funcionario> listarFuncionarios() {
		return funcionarioRepository.findAll();
	}

	// criando um novo funcionario
	@PostMapping("/funcionarios/criar")
	public Funcionario criarFuncionario(@RequestBody Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

	// criando uma lista de funcionarios
	@PostMapping("/funcionarios/listagem")
	public void salvarAll(@RequestBody FuncionarioDTOList<Funcionario> funcionarios) {
		 List<Funcionario> funcionario = new ArrayList<>();
		 funcionario = funcionarios.getFuncionarios();
		 funcionarioRepository.saveAll(funcionario);
	}

	// busca por id do funcionario
	@GetMapping("/funcionarios/{id}")
	public ResponseEntity<Funcionario> buscarFuncionarioById(@PathVariable Long id) {
		Funcionario funcionario = funcionarioRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Funcionario não encontrado pelo ID"));

		return ResponseEntity.ok(funcionario);
	}

	// update funcionario
	@PutMapping("/funcionarios/{id}")
	public ResponseEntity<Funcionario> updateFuncionario(@PathVariable Long id,
			@RequestBody Funcionario funcionarioDetalhes) {

		Funcionario funcionario = funcionarioRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Funcionario não existe"));

		funcionario.setNome(funcionarioDetalhes.getNome());
		funcionario.setSobrenome(funcionarioDetalhes.getSobrenome());
		funcionario.setEmailId(funcionarioDetalhes.getEmailId());

		Funcionario updateFuncionario = funcionarioRepository.save(funcionario);

		return ResponseEntity.ok(updateFuncionario);
	}

	// deletar funcionario
	@DeleteMapping("funcionarios/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteFuncionario(@PathVariable Long id) {
		Funcionario funcionario = funcionarioRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Funcionario não encontrado pelo ID"));

		funcionarioRepository.delete(funcionario);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Deletado com sucesso!", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
