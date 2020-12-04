/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1erparcialtdd;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        obtenerAccion persona1 = new obtenerAccion();
        persona1.obtener(true);
        obtenerAccion persona2 = new obtenerAccion();
        persona2.obtener2(true, true);
        obtenerAccion persona3 = new obtenerAccion();
        persona3.obtene3(false, true, true);
        obtenerAccion persona4 = new obtenerAccion();
        persona4.obtener4(false, true, true, "si");
        obtenerAccion persona5 = new obtenerAccion();
        persona5.obtener5(true, "porConfirmar");
        obtenerAccion persona6 = new obtenerAccion();
        persona6.obtener6(false, true, false, true, true);
        obtenerAccion persona7 = new obtenerAccion();
        persona7.obtener7(false,false);
        obtenerAccion persona8 = new obtenerAccion();
        persona8.obtener8(false, false);
        obtenerAccion persona9 = new obtenerAccion();
        persona9.ontener9(true, "si", false);
        obtenerAccion persona10 = new obtenerAccion();
        persona10.ontener10(true, "no", true);
    }
    
}
