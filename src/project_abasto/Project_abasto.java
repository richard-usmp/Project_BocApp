/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_abasto;

import static project_abasto.Inicio.*;


public class Project_abasto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }	


    public static void Provincia(){
        cmbProvin.removeAllItems();
        switch(cmbDep.getSelectedItem().toString()){
            case "Amazonas":
                cmbProvin.addItem("Bagua");
                cmbProvin.addItem("Bongará");
                cmbProvin.addItem("Chachapoyas");
                cmbProvin.addItem("Condorcanqui");
                cmbProvin.addItem("Luya");
                cmbProvin.addItem("Rodríguez de Mendoza");
                cmbProvin.addItem("Utcubamba");
                break;
            case "Áncash":
                cmbProvin.addItem("Huaraz");
                cmbProvin.addItem("Cochabamba");
                cmbProvin.addItem("Colcabamba");
                cmbProvin.addItem("Huanchay");
                cmbProvin.addItem("Independencia");
                cmbProvin.addItem("La Libertad");
                cmbProvin.addItem("Olleros");
                cmbProvin.addItem("Pampas Grande");
                cmbProvin.addItem("Pariacoto");
                cmbProvin.addItem("Pira");
                cmbProvin.addItem("Tarica");
                break;
            case "Apurímac":
                cmbProvin.addItem("Abancay");
                cmbProvin.addItem("Andahuaylas");
                cmbProvin.addItem("Antabamba");
                cmbProvin.addItem("Aymaraes");
                cmbProvin.addItem("Chincheros");
                cmbProvin.addItem("Cotabambas");
                cmbProvin.addItem("Grau");
            case "Arequipa":
                cmbProvin.addItem("Arequipa");
                cmbProvin.addItem("Camaná");
                cmbProvin.addItem("Caravelí");
                cmbProvin.addItem("Castilla");
                cmbProvin.addItem("Caylloma");
                cmbProvin.addItem("Condesuyos");
                cmbProvin.addItem("Islay");
                cmbProvin.addItem("La Unión");
                break;
            case "Ayacucho":
                cmbProvin.addItem("Huanta");
                cmbProvin.addItem("Cangallo");
                cmbProvin.addItem("Huamanga");
                cmbProvin.addItem("Vilcas Huaman");
                cmbProvin.addItem("Sucre");
                cmbProvin.addItem("Paucar del Sara Sara	");
                cmbProvin.addItem("Huanca Sancos");
                cmbProvin.addItem("Victor Fajardo");
                cmbProvin.addItem("Parinacochas");
                cmbProvin.addItem("Lucanas");
                cmbProvin.addItem("La Mar");
                break;
            case "Cajamarca":
                cmbProvin.addItem("Cajabamba");	
                cmbProvin.addItem("Cajamarca");	
                cmbProvin.addItem("Celendín ");	
                cmbProvin.addItem("Chota ");	
                cmbProvin.addItem("Contumazá");	
                cmbProvin.addItem("Cutervo");	
                cmbProvin.addItem("Hualgayoc");	
                cmbProvin.addItem("Jaén");	
                cmbProvin.addItem("San Ignacio");	
                cmbProvin.addItem("San Marcos");	
                cmbProvin.addItem("San Miguel");	
                cmbProvin.addItem("San Pablo");	
                cmbProvin.addItem("Santa Cruz");
                
                break;
            case "Callao":
                //desabilitado
                break;    
            case "Cusco":
                cmbProvin.addItem("Acomayo ");	
                cmbProvin.addItem("Anta ");	
                cmbProvin.addItem("Calca ");	
                cmbProvin.addItem("Canas ");	
                cmbProvin.addItem("Canchis ");	
                cmbProvin.addItem("Cuzco ");	
                cmbProvin.addItem("Chumbivilcas ");	
                cmbProvin.addItem("Espinar ");	
                cmbProvin.addItem("La Convención ");	
                cmbProvin.addItem("Paruro ");	
                cmbProvin.addItem("Paucartambo ");	
                cmbProvin.addItem("Quispicanchi  ");	
                cmbProvin.addItem("Urubamba ");
                break;
            case "Huancavelica":
                cmbProvin.addItem("Acobamba ");	
                cmbProvin.addItem("Angaraes ");	
                cmbProvin.addItem("Castrovirreyna ");	
                cmbProvin.addItem("Churcampa ");	
                cmbProvin.addItem("Huancavelica ");	
                cmbProvin.addItem("Huaytará ");	
                cmbProvin.addItem("Tayacaja ");

                break;
            case "Huánuco":
                cmbProvin.addItem("Ambo ");	
                cmbProvin.addItem("Dos de Mayo ");	
                cmbProvin.addItem("Huacaybamba ");	
                cmbProvin.addItem("Huamalíes ");	
                cmbProvin.addItem("Huánuco ");	
                cmbProvin.addItem("Lauricocha ");	
                cmbProvin.addItem("Leoncio Prado ");	
                cmbProvin.addItem("Marañón ");	
                cmbProvin.addItem("Pachitea ");	
                cmbProvin.addItem("Puerto Inca ");	
                cmbProvin.addItem("Yarowilca ");

                break;
            case "Ica":
                cmbProvin.addItem("Alto Larán ");	
                cmbProvin.addItem("El Carmen ");	
                cmbProvin.addItem("Chincha ");	
                cmbProvin.addItem("Tambo de Mora  ");	
                cmbProvin.addItem("Sunampe ");	
                cmbProvin.addItem("Grocio Prado ");	
                cmbProvin.addItem("Chavín  ");	
                cmbProvin.addItem("San Juan de Yanac  ");	
                cmbProvin.addItem("San Pedro de Huacarpana ");	
                cmbProvin.addItem(" ");	
                cmbProvin.addItem("Pueblo Nuevo ");

                break;
            case "Junín":
                cmbProvin.addItem("Huancayo ");	
                cmbProvin.addItem("Satipo ");	
                cmbProvin.addItem("Chanchamayo ");	
                cmbProvin.addItem("Tarma ");	
                cmbProvin.addItem("Jauja ");	
                cmbProvin.addItem("Concepción ");	
                cmbProvin.addItem("Chupaca ");	
                cmbProvin.addItem("Yauli ");	
                cmbProvin.addItem("Junín ");

                break;
            case "La Libertad":
                cmbProvin.addItem("Ascope ");	
                cmbProvin.addItem("Bolívar ");	
                cmbProvin.addItem("Chepén ");	
                cmbProvin.addItem("Gran Chimú ");	
                cmbProvin.addItem("Julcán ");	
                cmbProvin.addItem("Otuzco ");	
                cmbProvin.addItem("Pacasmayo ");	
                cmbProvin.addItem("Pataz ");	
                cmbProvin.addItem("Sánchez Carrión ");	
                cmbProvin.addItem("Santiago de Chuco ");	
                cmbProvin.addItem("Trujillo  ");	
                cmbProvin.addItem("Virú ");

                break;
            case "Lambayeque":
                cmbProvin.addItem("Chiclayo ");	
                cmbProvin.addItem("Lambayeque  ");	
                cmbProvin.addItem("Ferreñafe ");

                break;
            case "Lima":
                cmbProvin.addItem("Barranca ");	
                cmbProvin.addItem("Cajatambo ");	
                cmbProvin.addItem("Canta ");	
                cmbProvin.addItem("Cañete ");	
                cmbProvin.addItem("Huaral ");	
                cmbProvin.addItem("Huarochirí ");	
                cmbProvin.addItem("Huaura ");	
                cmbProvin.addItem("Lima ");	
                cmbProvin.addItem("Oyón  ");	
                cmbProvin.addItem("Yauyos ");

                break;
            case "Loreto":
                cmbProvin.addItem("Alto Amazonas ");	
                cmbProvin.addItem("Datem del Marañón ");	
                cmbProvin.addItem("Loreto ");	
                cmbProvin.addItem("Mariscal Ramón Castilla. ");
                cmbProvin.addItem("Maynas ");	
                cmbProvin.addItem("Putumayo ");	
                cmbProvin.addItem("Requena ");	
                cmbProvin.addItem("Ucayali ");

                break;
            case "Madre de Dios":
                cmbProvin.addItem("Tambopata");	
                cmbProvin.addItem("Manu");	
                cmbProvin.addItem("Tahuamanu");

                break;
            case "Moquegua":
                cmbProvin.addItem("General Sánchez Cerro");	
                cmbProvin.addItem("Ilo");	
                cmbProvin.addItem("Mariscal Nieto");

                break;
            case "Pasco":
                cmbProvin.addItem("Pasco");	
                cmbProvin.addItem("Oxapampa");	
                cmbProvin.addItem("Daniel Alcides Carrión");

                break;
            case "Piura":
                cmbProvin.addItem("Ayabaca  ");	
                cmbProvin.addItem("Morropón  ");	
                cmbProvin.addItem("Paita  ");	
                cmbProvin.addItem("Piura  ");	
                cmbProvin.addItem("Sechura  ");	
                cmbProvin.addItem("Sullana  ");	
                cmbProvin.addItem("Talara  ");	
                cmbProvin.addItem("Huancabamba  ");

                break;
            case "Puno":
                cmbProvin.addItem("Puno ");	
                cmbProvin.addItem("Azángaro ");	
                cmbProvin.addItem("Carabaya ");	
                cmbProvin.addItem("El Collao ");	
                cmbProvin.addItem("Chucuito ");
                cmbProvin.addItem("Huancané ");	
                cmbProvin.addItem("San Antonio de Putina ");
                cmbProvin.addItem("Moho ");	
                cmbProvin.addItem("Lampa ");	
                cmbProvin.addItem("Melgar ");	
                cmbProvin.addItem("San Román ");
                cmbProvin.addItem("Sandia ");	
                cmbProvin.addItem("Yunguyo ");

                break;
            case "San Martín":
                cmbProvin.addItem("Bellavista ");	
                cmbProvin.addItem("El Dorado ");	
                cmbProvin.addItem("Huallaga ");	
                cmbProvin.addItem("Lamas ");	
                cmbProvin.addItem("Mariscal Cáceres ");	
                cmbProvin.addItem("Moyobamba ");	
                cmbProvin.addItem("Picota ");	
                cmbProvin.addItem("Rioja ");	
                cmbProvin.addItem("San Martín ");	
                cmbProvin.addItem("Tocache ");
                break;
            case "Tacna":
                cmbProvin.addItem("Candarave ");	
                cmbProvin.addItem("Tarata ");	
                cmbProvin.addItem("Tacna ");	
                cmbProvin.addItem("Jorge Basadre ");
                break;
            case "Tumbes":
                cmbProvin.addItem("Contralmirante Villar ");
                cmbProvin.addItem("Tumbes  ");	
                cmbProvin.addItem("Zarumilla  ");
                break;
            case "Ucayali":
                cmbProvin.addItem("Atalaya ");
                cmbProvin.addItem("Coronel Portillo ");	
                cmbProvin.addItem("Padre Abad ");	
                cmbProvin.addItem("Purús ");
                break;        
        }
    }
    
}
