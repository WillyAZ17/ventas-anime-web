/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import clase.Categoria;
import clase.Serie;
import controlador.*;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaoSerie obj = new DaoSerie();

        for ( Serie c : obj.ListaSerie(1000)) {
            System.out.println(c.getName()+"\t");
        }
    }

}
