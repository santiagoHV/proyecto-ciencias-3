/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author mdelgado
 */
public class AnalizadorLexico {
    public static void main(String[] args) throws Exception {
        String camino= "../LexicoClase/src/Analizador/Lexico.flex";
        String camino1= "../LexicoClase/src/Analizador/LexicoCup.flex";
        String[] caminoS= {"-parser","Sintaxis","../LexicoClase/src/Analizador/Sintaxis.cup"};
        generarLex(camino, camino1, caminoS);
        
    }
    public static void generarLex(String camino, String camino1, String[] caminoS) throws IOException, Exception {
        File arc; 
        arc = new File(camino);
        JFlex.Main.generate(arc);
        arc = new File(camino1);
        JFlex.Main.generate(arc);
        java_cup.Main.main(caminoS);     
        
        Path caminoSym = Paths.get("../LexicoClase/src/Analizador/sym.java");
        if (Files.exists(caminoSym)) {
            Files.delete(caminoSym);
        }
        Files.move(
                Paths.get("../LexicoClase/sym.java"), 
                Paths.get("../LexicoClase/src/Analizador/sym.java")
        );
        Path caminoSint = Paths.get("../LexicoClase/src/Analizador/Sintaxis.java");
        if (Files.exists(caminoSint)) {
            Files.delete(caminoSint);
        }
        Files.move(
                Paths.get("../LexicoClase/Sintaxis.java"), 
                Paths.get("../LexicoClase/src/Analizador/Sintaxis.java")
        );        
    }
}
