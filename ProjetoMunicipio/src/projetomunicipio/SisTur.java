package projetomunicipio;

import Exception.AtrativoJaExisteException;
import Exception.AtrativoNaoExisteException;
import Exception.MunicipioJaExisteException;
import Exception.MunicipioNaoExisteException;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SisTur {

	public static void main(String[] args) throws MunicipioJaExisteException, MunicipioNaoExisteException,
			AtrativoJaExisteException, AtrativoNaoExisteException {
		Gravar gravador  = new Gravar();		
		Scanner leitor = new Scanner(System.in);
		List<Municipio> listaMunicipio = new ArrayList<Municipio>();		
		AreaDeInteresseTuristico regiao = new AreaDeInteresseTuristico(listaMunicipio, "Pernambuco");
		int opçao = 0;
		while (opçao != 7) {
			opçao = inputInt("\n\n1-Cadastrar Município"
					+ "\n2-Cadastrar Atrativo Turistico"
					+ "\n3-Recuperar Municipios"
					+ "\n4-Recuperar Atrativo Turistico de Municipio"
					+ "\n5-Listar Municípios"
					+ "\n6-Listar Atrativos de determinado Municipío"
					+ "\n7-Sair\nOpção:\n",leitor);
			switch (opçao) {
			case 1:
				List<AtrativoTuristico> atrativosTuristicos = new ArrayList();
				List<MeioDeHospedagem> meiosDeHospedagem = new ArrayList();
				System.out.println("\n\n===========================================");
				System.out.println("Cadrastando Município");
				String nome = input("Nome do Município: ", leitor);
				int populaçao = inputInt("Quantidade da População: ", leitor);
				double latitude = Double.parseDouble(input("Informe a Latitude: ", leitor));
				double longitude = Double.parseDouble(input("Informe a Longitude: ", leitor));
				String estado = input("Estado do Município: ", leitor);
				String site = input("Site do Município: ", leitor);
				Municipio munic = new Municipio(nome, populaçao, atrativosTuristicos, latitude, longitude,
						meiosDeHospedagem, estado, site);
				try {
					regiao.cadastrarMunicipio(munic);					
					System.out.println("===========================================");
					System.out.println("Município Cadastrado com sucesso");
				} catch (MunicipioJaExisteException erro) {
					System.out.println(erro.getMessage());
				}
				String sair = input("Aperte enter para continuar", leitor);
				break;
			case 2:
				String nomeMunicipio = input("Informe o Município: ",leitor);
				String nomeEstado = input("Informe o Estado: ",leitor);	
				try {
					Municipio municipioPesquisado = regiao.pesquisarMunicipio(nomeMunicipio, nomeEstado);//regiao.pesquisarMunicipio(nomeMunicipio, nomeEstado)					
					AtrativoTuristico atrativoTuristico = null;
					System.out.println("\n\n===========================================");
					System.out.println("Cadrastando Atrativo Turistico");
					int opçaoAT = inputInt("1-AtrativoNatural\n2-Atrativo Arificial\n3-Evento Programado\nOpção:\n",leitor);
					String nomeAtratTuristico = input("Atrativo Turistico:", leitor);
					double latitudeAtratTuristico = Double.parseDouble(input("Informe a Latitude: ", leitor));
					double longitudeAtratTuristico = Double.parseDouble(input("Informe a Longitude: ", leitor));
					String comoChegar = input("Informe como chegar: ", leitor);
					String siteAtratTuristico = input("Site: ", leitor);
					String infoContato = input("Informe o Numéro para contato: ", leitor);
					switch (opçaoAT) {
					case 1:
						String perigoT = "não";
						String propriaB = "não";
						String tipoOrla = "";
						int opçaoPG = inputInt("1-Praia\n2-Generico\nopção:\n",leitor);
						switch(opçaoPG) {
						case 1:
							String perigoTubarao = input("Perigo de tubarão(S/n): ",leitor);
							String propriaBanho = input("Propria para banhao(S/n): ",leitor);
							int  tipoOrlas = inputInt("Tipo de Orla: \n1-Mar Aberto\n2-Pequenas Ondas\n3-Mar Abrigado\n4-Ondas Medias\n5-Piscinas Naturais\n6-Ondas Fortes\nOpção: \n",leitor);
							switch(tipoOrlas) {
								case 1:
									tipoOrla = "MAR ABERTO";
									break;
								case 2:
									tipoOrla = "PEQUENAS ONDAS";
									break;
								case 3:
									tipoOrla = "MAR ABRIGADO";
									break;
								case 4:
									tipoOrla = "ONDAS MEDIAS";
									break;
								case 5:
									tipoOrla = "PISCINAS NATURAIS";
									break;
								case 6:
									tipoOrla = "ONDAS FORTES";
									break;
								
							}
							if(perigoTubarao.equals("S")) {
								perigoT = "sim";
							}
							if(propriaBanho.equals("S")) {
								propriaB = "sim";
							}
							atrativoTuristico = new Praia(perigoT,propriaB,tipoOrla,nomeAtratTuristico,latitudeAtratTuristico,longitudeAtratTuristico,comoChegar,siteAtratTuristico,infoContato);						
							break;
						case 2:
							atrativoTuristico = new AtrativoNatural(nomeAtratTuristico, latitudeAtratTuristico,
									longitudeAtratTuristico, comoChegar, siteAtratTuristico, infoContato);
							break;
						}					
						break;
					case 2:
						String anoFundaçao = input("Informe o ano da Fundação: ", leitor);
						String autor = input("Informe o nome de quem a construiu: ", leitor);
						atrativoTuristico = new AtrativoArtificial(nomeAtratTuristico, latitudeAtratTuristico,
								longitudeAtratTuristico, comoChegar, siteAtratTuristico, infoContato, anoFundaçao,
								autor);					
						break;
					case 3:
						String dataInicio = input("Informe a data de Inicio do Evento:", leitor);
						String dataFim = input("Informe a data de encerramento do Evento: ", leitor);
						String tipo = input("Informe o tipo do Evento: ", leitor);
						String logradouro = input("Informe o logradouro(Cidade): ", leitor);
						String numero = input("Informe o numero: ", leitor);
						String bairro = input("Informe o nome do bairro: ", leitor);
						Endereço endereço = new Endereço(logradouro, numero, bairro);
						atrativoTuristico = new EventoProgramado(nomeAtratTuristico, latitudeAtratTuristico,
								longitudeAtratTuristico, comoChegar, siteAtratTuristico, infoContato, dataInicio,
								dataFim, tipo, endereço);					
						break;
					}				
					try {					
						regiao.cadastrarAtrativoTuristico(atrativoTuristico, nomeMunicipio, nomeEstado);																
						System.out.println("===========================================");
						System.out.printf("%s cadastrado com sucesso\n",atrativoTuristico.getNome());
					} catch (AtrativoJaExisteException erro) {
						System.out.println(erro.getMessage());
					} catch(MunicipioNaoExisteException erro) {
						System.out.println(erro.getMessage());
					}
				}catch(MunicipioNaoExisteException erro) {
					System.out.println("Muinicipio ou Estado não encontrado");
				}
				String sairA = input("Aperte enter para continuar\n", leitor);
			break;
			case 3:				
				try {
					List<Municipio> listaMunicipios = gravador.recuperarMunicipio();					
					if(listaMunicipios.size() > 0) {							
						for(Municipio municipio:listaMunicipios) {
							try {
								regiao.cadastrarMunicipio(municipio);
								System.out.println("municipio "+municipio+" recuperado com sucesso");
							}catch(MunicipioJaExisteException erro) {
								System.out.printf("municipio %s já existe e não sera gravado\n",municipio);								
							}
						}											
					}else {
						System.out.println("municipios nao cadastrados");
					}
				} catch (IOException erro) {
					System.out.println("arquivo nao encontrado");
				}
				break;
			case 4:
				try {
					String municipio = input("Escolha o Municipio: ", leitor);	
					String estadoE = input("Escolha o Estado: ", leitor);										
					Municipio m = regiao.pesquisarMunicipio(municipio, estadoE);		
					List<AtrativoTuristico> listaAtrativoTuristicos = gravador.recuperarAtrativo(municipio);
					if(listaAtrativoTuristicos.size() > 0) {
						for(AtrativoTuristico atrativo:listaAtrativoTuristicos) {
							try {									
								regiao.cadastrarAtrativoTuristico(atrativo, municipio, estadoE);
								System.out.println("atrativo "+atrativo.getNome()+" recuperado com sucesso");																	
							}catch(AtrativoJaExisteException erro) {
								System.out.printf("atrativo %s já existe e não sera gravado\n",atrativo.getNome());									
							}
						}
					}else {
						System.out.println("Não á atrativo cadastrado");
					}
				}catch(MunicipioNaoExisteException erro) {
					System.out.println("Municipio não foi cadastrados");									
				}catch(IOException erro) {
					System.out.println("ERRO ao carregar lista de atrativos");
				}
				
				break;
			case 5:
				System.out.println("\n\n===========================================");
				System.out.println("Monstrando Municipios ");
				List<Municipio> listaMunicipios = regiao.getMunicipios();
				if(listaMunicipio.size() > 0) {
					for (Municipio m : listaMunicipio) {
						System.out.println(m.getNome());						
					}
				}else {
					System.out.println("Municipio não cadastrados");
				}								
				String sairM = input("Aperte enter para continuar\n", leitor);
				break;
			case 6:
				System.out.println("\n\n===========================================");
				String determinarMunicipio = input("Escolha o Municipio: ", leitor);
				String determinarEstado = input("Informe o Estado: ",leitor);	
				try {
					Municipio municipio = regiao.pesquisarMunicipio(determinarMunicipio,determinarEstado);
					List<AtrativoTuristico> listaAtrativoTuristicos = regiao.getAtrativosTuristicosDoMunicipio(determinarMunicipio, determinarEstado);
					if(listaAtrativoTuristicos.size() > 0) {																							
						for (AtrativoTuristico atrativos : listaAtrativoTuristicos){
							System.out.println(atrativos.getDescricao());
						}						
					}else {
						System.out.println("O município não tem atrativos cadastrados");
					}
				}catch(MunicipioNaoExisteException erro) {
					System.out.println("Municipio não existe");
				}
				break;
			case 7:
				System.out.println("SESSÃO ENCERRADA");
				try {
					gravador.gravarMunicipio(listaMunicipio);
					for(Municipio m:listaMunicipio) {											
						gravador.gravarAtrativo(regiao.getAtrativosTuristicosDoMunicipio(m.getNome(), m.getEstado()), m.getNome());						
					}				
				}catch(IOException erro) {
					System.out.println("erro ao salvar");
				}
				break;
			}
		}

		leitor.close();
	}

	public static String input(String texto, Scanner leitor) {
		System.out.print(texto);		
		return leitor.nextLine();
	}

	public static int inputInt(String texto, Scanner leitor) {
		System.out.print(texto);
		return Integer.parseInt(leitor.nextLine());
	}

}
