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

public class FormularioDeAnamnese {
	private String informante;
	private String queixaPrincipal;
	private String historiaDaDoencaAtual;
	private String interrogatorio;
	private String sistemaCardiovascular;
	private String sistemaDigestorio;
	private String aparelhoGeniturinario;
	private String sistemaTegumentar;
	private String sistemaNervoso;
	private String sistemaMuscularEsqueletico;
	private String sistemaArticular;
	private String aparelhoVisual;
	private String aparelhoAuditivo;
	private String tratamentosAnteriores;
	private String antecendentesPessoais;
	private String antecendentesFamiliares;
	private boolean tabagismo;
	
	public FormularioDeAnamnese(String informante, String queixaPrincipal, String historiaDaDoencaAtual,
			String interrogatorio, String sistemaCardiovascular, String sistemaDigestorio, 
			String aparelhoGeniturinario, String sistemaTegumentar, String sistemaNervoso,
			String sistemaMuscularEsqueletico, String sistemaArticular, String aparelhoVisual,
			String aparelhoAuditivo, String tratamentosAnteriores, String antecendentesPessoais,
			String antecendentesFamiliares, boolean tabagismo){
		this.setInformante(informante);
		this.setQueixaPrincipal(queixaPrincipal);
		this.setHistoriaDaDoencaAtual(historiaDaDoencaAtual);
		this.setInterrogatorio(interrogatorio);
		this.setSistemaCardiovascular(sistemaCardiovascular);
		this.setSistemaDigestorio(sistemaDigestorio);
		this.setAparelhoGeniturinario(aparelhoGeniturinario);
		this.setSistemaTegumentar(sistemaTegumentar);
		this.setSistemaNervoso(sistemaNervoso);
		this.setSistemaMuscularEsqueletico(sistemaMuscularEsqueletico);
		this.setSistemaArticular(sistemaArticular);
		this.setAparelhoVisual(aparelhoVisual);
		this.setAparelhoAuditivo(aparelhoAuditivo);
		this.setTratamentosAnteriores(tratamentosAnteriores);
		this.setAntecendentesFamiliares(antecendentesFamiliares);
		this.setAntecendentesPessoais(antecendentesPessoais);
		this.setTabagismo(tabagismo);
	}
	
	public String getInformante() {
		return informante;
	}
	
	public void setInformante(String informante) {
		this.informante = informante;
	}
	
	public String getQueixaPrincipal() {
		return queixaPrincipal;
	}
	
	public void setQueixaPrincipal(String queixaPrincipal) {
		this.queixaPrincipal = queixaPrincipal;
	}
	
	public String getHistoriaDaDoencaAtual() {
		return historiaDaDoencaAtual;
	}
	
	public void setHistoriaDaDoencaAtual(String historiaDaDoencaAtual) {
		this.historiaDaDoencaAtual = historiaDaDoencaAtual;
	}
	
	public String getInterrogatorio() {
		return interrogatorio;
	}
	
	public void setInterrogatorio(String interrogatorio) {
		this.interrogatorio = interrogatorio;
	}
	
	public String getSistemaCardiovascular() {
		return sistemaCardiovascular;
	}
	
	public void setSistemaCardiovascular(String sistemaCardiovascular) {
		this.sistemaCardiovascular = sistemaCardiovascular;
	}
	
	public String getSistemaDigestorio() {
		return sistemaDigestorio;
	}
	
	public void setSistemaDigestorio(String sistemaDigestorio) {
		this.sistemaDigestorio = sistemaDigestorio;
	}
	
	public String getAparelhoGeniturinario() {
		return aparelhoGeniturinario;
	}
	
	public void setAparelhoGeniturinario(String aparelhoGeniturinario) {
		this.aparelhoGeniturinario = aparelhoGeniturinario;
	}
	
	public String getSistemaTegumentar() {
		return sistemaTegumentar;
	}
	
	public void setSistemaTegumentar(String sistemaTegumentar) {
		this.sistemaTegumentar = sistemaTegumentar;
	}
	
	public String getSistemaNervoso() {
		return sistemaNervoso;
	}
	
	public void setSistemaNervoso(String sistemaNervoso) {
		this.sistemaNervoso = sistemaNervoso;
	}
	
	public String getSistemaMuscularEsqueletico() {
		return sistemaMuscularEsqueletico;
	}
	
	public void setSistemaMuscularEsqueletico(String sistemaMuscularEsqueletico) {
		this.sistemaMuscularEsqueletico = sistemaMuscularEsqueletico;
	}
	
	public String getSistemaArticular() {
		return sistemaArticular;
	}
	
	public void setSistemaArticular(String sistemaArticular) {
		this.sistemaArticular = sistemaArticular;
	}
	
	public String getAparelhoVisual() {
		return aparelhoVisual;
	}
	
	public void setAparelhoVisual(String aparelhoVisual) {
		this.aparelhoVisual = aparelhoVisual;
	}
	
	public String getAparelhoAuditivo() {
		return aparelhoAuditivo;
	}
	
	public void setAparelhoAuditivo(String aparelhoAuditivo) {
		this.aparelhoAuditivo = aparelhoAuditivo;
	}
	
	public String getTratamentosAnteriores() {
		return tratamentosAnteriores;
	}
	
	public void setTratamentosAnteriores(String tratamentosAnteriores) {
		this.tratamentosAnteriores = tratamentosAnteriores;
	}
	
	public String getAntecendentesPessoais() {
		return antecendentesPessoais;
	}
	
	public void setAntecendentesPessoais(String antecendentesPessoais) {
		this.antecendentesPessoais = antecendentesPessoais;
	}
	
	public String getAntecendentesFamiliares() {
		return antecendentesFamiliares;
	}
	
	public void setAntecendentesFamiliares(String antecendentesFamiliares) {
		this.antecendentesFamiliares = antecendentesFamiliares;
	}
	
	public boolean isTabagismo() {
		return tabagismo;
	}
	
	public void setTabagismo(boolean tabagismo) {
		this.tabagismo = tabagismo;
	}
	
	
}
