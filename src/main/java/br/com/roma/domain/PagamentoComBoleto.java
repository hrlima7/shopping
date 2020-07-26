package br.com.roma.domain;

import java.util.Date;

import br.com.roma.domain.enums.EstadoPagamento;

public class PagamentoComBoleto extends Pagamento {

	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido,Date dataVencimento, Date DataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento =  dataVencimento; 
		
	}
	
	
}
