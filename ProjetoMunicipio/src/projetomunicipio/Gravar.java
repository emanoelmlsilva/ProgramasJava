package projetomunicipio;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Gravar {
	
	//gravarMunicipio
	public void gravarMunicipio(List<Municipio> listaMunicipio) throws IOException {
		BufferedWriter gravador = null;
		try {
			gravador = new BufferedWriter(new FileWriter("municipios"));
			gravador.write(listaMunicipio.size()+"\n");
			for(Municipio municipio:listaMunicipio) {
				gravador.write(municipio.getNome()+"\n");
				gravador.write(municipio.getPopulaçao()+"\n");
				gravador.write(municipio.getLatitude()+"\n");
				gravador.write(municipio.getLongitude()+"\n");
				gravador.write(municipio.getEstado()+"\n");
				gravador.write(municipio.getSite()+"\n");
			}
		}finally {
			if(gravador != null) {
				gravador.close();
			}
		}
	}
	
	//recuperarMunicipio
	public List<Municipio> recuperarMunicipio() throws IOException{
		BufferedReader leitor = null;
		List<Municipio> municipios = new ArrayList<Municipio>();
		try {
			leitor = new BufferedReader(new FileReader("municipios"));
			String texto = null;
			do {
				texto = leitor.readLine();		
				if(texto != null) {
					int quantidadeMunicipio = Integer.parseInt(texto);
					for(int i = 0;i < quantidadeMunicipio;i++) {
						String nome = leitor.readLine();
						int populacao = Integer.parseInt(leitor.readLine());
						double latitude = Double.parseDouble(leitor.readLine());
						double longitude = Double.parseDouble(leitor.readLine());
						String estado = leitor.readLine();
						String site = leitor.readLine();
						Municipio municipio = new Municipio(nome,populacao,new ArrayList(),latitude,longitude,new ArrayList(),estado,site);
						municipios.add(municipio);
					}
				}
			}while(texto != null);
		}finally {
			if(leitor != null) {
				leitor.close();
			}
		}
		return municipios;
	}	

	public void gravarAtrativo(List<AtrativoTuristico>listaAtrativo,String nomeMunicipio )throws IOException{			
			BufferedWriter gravador = null;						
			try {
				gravador = new BufferedWriter(new FileWriter("Atrativo"+nomeMunicipio));
				gravador.write(listaAtrativo.size()+"\n");				
				for(AtrativoTuristico at:listaAtrativo) {
					String tipo = null;						
					if(at.getTipo().equals("Atrativo Natural")) {
						AtrativoNatural atrativoN = (AtrativoNatural) at;						
						gravador.write(atrativoN.getTipo()+"\n");
						gravador.write(atrativoN.getNome()+"\n");
						gravador.write(atrativoN.getLatitude()+"\n");
						gravador.write(atrativoN.getLongitude()+"\n");
						gravador.write(atrativoN.getComoChegar()+"\n");
						gravador.write(atrativoN.getSite()+"\n");
						gravador.write(atrativoN.getInfoContato()+"\n");						
					}else if(at.getTipo().equals("Atrativo Artificial")){
						AtrativoArtificial atrativoA = (AtrativoArtificial) at;						
						gravador.write(atrativoA.getTipo()+"\n");
						gravador.write(atrativoA.getNome()+"\n");
						gravador.write(atrativoA.getLatitude()+"\n");
						gravador.write(atrativoA.getLongitude()+"\n");
						gravador.write(atrativoA.getComoChegar()+"\n");
						gravador.write(atrativoA.getSite()+"\n");
						gravador.write(atrativoA.getInfoContato()+"\n");
						gravador.write(atrativoA.getFundacao()+"\n");
						gravador.write(atrativoA.getFundado()+"\n");						
					}else if(at.getTipo().equals("Praia")){///atrativos.getClass().getTypeName() == Praia.class.getTypeName()) {						
						Praia praia = (Praia) at;						
						gravador.write(praia.getTipo()+"\n");
						gravador.write(praia.getNome()+"\n");
						gravador.write(praia.getLatitude()+"\n");
						gravador.write(praia.getLongitude()+"\n");
						gravador.write(praia.getComoChegar()+"\n");
						gravador.write(praia.getSite()+"\n");
						gravador.write(praia.getInfoContato()+"\n");
						gravador.write(praia.getPerigoTubarao()+"\n");
						gravador.write(praia.getPropriaParaBanho()+"\n");
						gravador.write(praia.getTipoDeOrla()+"\n");												
					}else if(at.getTipo().equals("Evento Programado")){//atrativos.getClass().getTypeName() == EventoProgramado.class.getTypeName()) {												
						EventoProgramado evento = (EventoProgramado) at;						
						gravador.write(evento.getTipo()+"\n");
						gravador.write(evento.getNome()+"\n");
						gravador.write(evento.getLatitude()+"\n");
						gravador.write(evento.getLongitude()+"\n");
						gravador.write(evento.getComoChegar()+"\n");
						gravador.write(evento.getSite()+"\n");
						gravador.write(evento.getInfoContato()+"\n");
						gravador.write(evento.getDataInicio()+"\n");
						gravador.write(evento.getDataFim()+"\n");
						gravador.write(evento.getTipoO()+"\n");
						gravador.write(evento.getEndereço().getLogradouro()+"\n");
						gravador.write(evento.getEndereço().getNumero()+"\n");
						gravador.write(evento.getEndereço().getBairro()+"\n");						
					}
				}								
			}finally {
				if(gravador != null) {
					gravador.close();//fecha o stream(fluxo) de escrita.
				}
			}
		}
	
		public List<AtrativoTuristico> recuperarAtrativo(String nomeMunicipio) throws IOException{
			BufferedReader leitor = null;
			List<AtrativoTuristico> listaAtrativos = new ArrayList<AtrativoTuristico>();
			try {
				leitor = new BufferedReader(new FileReader("Atrativo"+nomeMunicipio));
				String texto = null;				
				do {
					texto = leitor.readLine(); //ler a proxima 	linha do arquivo
					if(texto != null) {						
						int quantidadeAtrativo = Integer.parseInt(texto);
						for(int i = 0;i < quantidadeAtrativo;i++) {
							AtrativoTuristico atrativo = null;
							String tipo = leitor.readLine();							
							String nome = leitor.readLine();							
							double latitude = Double.parseDouble(leitor.readLine());							
							double longitude = Double.parseDouble(leitor.readLine());							
							String comoChegar = leitor.readLine();
							String site = leitor.readLine();
							String infoContato = leitor.readLine();
							if(tipo.equals("Atrativo Natural")) {
								atrativo = new AtrativoNatural(nome,latitude,longitude,comoChegar,site,infoContato);
							}else if(tipo.equals("Atrativo Artificial")) {
								String fundacao = leitor.readLine();
								String fundador = leitor.readLine();
								atrativo = new AtrativoArtificial(nome,latitude,longitude,comoChegar,site,infoContato,fundacao,fundador);
							}else if(tipo.equals("Praia")) {
								String perigoT = leitor.readLine();
								String propriaB = leitor.readLine();
								String tipoO = leitor.readLine();
								atrativo = new Praia(perigoT,propriaB,tipoO,nome,latitude,longitude,comoChegar,site,infoContato);
							}else if(tipo.equals("Evento Programado")) {								
								String dataInicio = leitor.readLine();
								String dataFinal = leitor.readLine();
								String tipoE = leitor.readLine();
								String logradouro = leitor.readLine();
								String numero = leitor.readLine();
								String bairro = leitor.readLine();
								Endereço endereço = new Endereço(logradouro,numero,bairro);
								atrativo = new EventoProgramado(nome,latitude,longitude,comoChegar,site,infoContato , dataInicio, dataFinal, tipoE,endereço);
							}
							if(atrativo != null) {
								listaAtrativos.add(atrativo);
							}
						}						
					}
				}while(texto != null);
			}finally {
				if(leitor != null) {
					leitor.close();
				}
			}
			
			return listaAtrativos;
			
		}
}
