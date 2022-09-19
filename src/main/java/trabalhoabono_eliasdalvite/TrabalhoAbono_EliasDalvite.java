/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoabono_eliasdalvite;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elias Dalvite
 */
public class TrabalhoAbono_EliasDalvite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual CEP deseja procurar?");
        String cep = in.nextLine();

        String endereço;
        String complemento;
        String bairro;
        String ibge;
        String uf;

        ViaCEP viaCep = new ViaCEP();

        try {
            viaCep.buscar(cep);
            endereço = viaCep.getLogradouro();
            complemento = viaCep.getComplemento();
            bairro = viaCep.getBairro();
            ibge = viaCep.getIbge();
            uf = viaCep.getUf();
            if (!endereço.equals("")) {
                System.out.println("Endereço: " + endereço);
            }
            if (!complemento.equals("")) {
                System.out.println("Complemento: " + complemento);
            }
            if (!bairro.equals("")) {
                System.out.println("Bairro: " + bairro);
            }
            if (!ibge.equals("")) {
                System.out.println("IBGE: " + ibge);
            }
            if (!uf .equals("")) {
                System.out.println("UF: " + uf);
            }
        } catch (ViaCEPException ex) {
            Logger.getLogger(TrabalhoAbono_EliasDalvite.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
