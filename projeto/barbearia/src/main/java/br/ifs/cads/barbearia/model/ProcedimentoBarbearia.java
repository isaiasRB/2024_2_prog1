package br.ifs.cads.barbearia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProcedimentoBarbearia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "procedimentoId")
    private Procedimento procedimento;

    @ManyToOne
    @JoinColumn(name = "barbeariaId")
    private Barbearia barbearia;

    private Double comissao;

   
    
    // Getters e Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Procedimento getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(Procedimento procedimento) {
		this.procedimento = procedimento;
	}

	public Barbearia getBarbearia() {
		return barbearia;
	}

	public void setBarbearia(Barbearia barbearia) {
		this.barbearia = barbearia;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public StatusProcedimento getStatus() {
		return status;
	}

	public void setStatus(StatusProcedimento status) {
		this.status = status;
	}

   
}
