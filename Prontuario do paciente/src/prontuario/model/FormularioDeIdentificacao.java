/**
 * Copyright 2017 Carlos Macêdo
 * 
 * This file is part of SeT software.
 * 
 *  SeT is free software: you can 
 *  redistribute it and/or modify it under the terms of the GNU General 
 *  Public License as published by the Free Software Foundation, either 
 *  version 3 of the License, or (at your option) any later version.
 *  
 *  SeT is distributed in the hope that
 *  it will be useful, but WITHOUT ANY WARRANTY; without even the implied 
 *  warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See 
 *  the GNU General Public License for more details.
 *  You should have received a copy of the GNU General Public License
 *  along with SeT
 *  If not, see <http://www.gnu.org/licenses/>.
 *  
 *  Contact: carlosmacedo025 at gmail dot com
 */
package prontuario.model;

public class FormularioDeIdentificacao {
	private int numeroRegistro;
	private String localNascimento;
	private String nomeMae;
	private String nomePai;
	private String profissao;
	private String estadoCivil;
	private String nomeConjuge;
	
	public FormularioDeIdentificacao(int numeroRegistro, String localNascimento, String nomeMae,
			String nomePai, String profissao, String estadoCivil, String nomeConjuge){
		this.setNumeroRegistro(numeroRegistro);
		this.setLocalNascimento(localNascimento);
		this.setNomeMae(nomeMae);
		this.setNomePai(nomePai);
		this.setProfissao(profissao);
		this.setEstadoCivil(estadoCivil);
		this.setNomeConjuge(nomeConjuge);
	}
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	public String getLocalNascimento() {
		return localNascimento;
	}
	
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public String getNomeConjuge() {
		return nomeConjuge;
	}
	
	public void setNomeConjuge(String nomeConjuge) {
		this.nomeConjuge = nomeConjuge;
	}
	
	
}
