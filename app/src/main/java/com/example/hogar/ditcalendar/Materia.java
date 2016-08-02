package com.example.hogar.ditcalendar;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hogar on 01/08/2016.
 */
public class Materia {

    private static String[] materias = {"Álgebra","Elementos de Informática", "Expresion de Problemas y Algoritmos","Inglés",
            "Análisis Matemático - S", "Algoritmica y Programación I", "Elementos de Lógica y Mat. Discreta",
            "Sistemas y Organizaciones", "Arquitectura de Computadoras", "Algoritmica y Programación II",
            "Base de Datos I", "Estadistica", "Programación Orientada a Objetos", "Introducción a la Concurrencia",
            "Laboratorio de Programación y Lenguajes", "Sistemas Operativos - S", "Ingenieria de Software I - T",
            "Desarrollo de Software", "Ingenieria de Software II - T", "Fundamentos Teóricos de Informática",
            "Redes y Transmisión de Datos", "Base de Datos II", "Paradigmas y Lenguajes de Programación - T",
            "Administración de Redes y Seguridad", "Ingenieria de Software III - T", "Aspectos Legales y Profesionales",
            "Sistemas Distribuidos", "Administración de Proyectos", "Aplicaciones Web", "Taller de Nuevas Tecnologias",
            "Modelos y Simulación", "Planificación y Gestión de Sistemas de Información", "Sistemas de Soporte para la Toma de Decisiones",
            "Introducción a la Metodología de la Investigación Científica y Técnicas Comunicacionales"};

    private static Map<String, Preferencia> materiasPreferencias = new HashMap<String, Preferencia>(); // HashMap que contiene los codigos de las materias

    /**
     * Metodo privado que inicializa la informacion referente a las materias
     */
    private static void inicializar(){
        if (materiasPreferencias.isEmpty()){
            materiasPreferencias.put("Álgebra", new Preferencia("5cv4ur5p3enrbvjlt875us5qes@group.calendar.google.com", "MA045", "A", Color.BLUE));
            materiasPreferencias.put("Elementos de Informática", new Preferencia("IF001", "EI", Color.GREEN));
            materiasPreferencias.put("Expresion de Problemas y Algoritmos", new Preferencia("jrjdur8jrdkktb4b87ctfh9nt4@group.calendar.google.com","IF002", "EPA", Color.CYAN));
            materiasPreferencias.put("Inglés", new Preferencia("FA007", "I", Color.YELLOW));
            materiasPreferencias.put("Análisis Matemático - S", new Preferencia("MA048", "AM", Color.RED));
            materiasPreferencias.put("Algoritmica y Programación I", new Preferencia("IF003", "API", Color.LTGRAY));
            materiasPreferencias.put("Elementos de Lógica y Mat. Discreta", new Preferencia("MA008", "MD", Color.CYAN));
            materiasPreferencias.put("Sistemas y Organizaciones", new Preferencia("IF004", "SyO", Color.GREEN));
            materiasPreferencias.put("Arquitectura de Computadoras", new Preferencia("IF005", "AC", Color.RED));
            materiasPreferencias.put("Algoritmica y Programación II", new Preferencia("oigrphjfmk8dbhble3ed7m897s@group.calendar.google.com", "IF006", "APII", Color.CYAN));
            materiasPreferencias.put("Base de Datos I", new Preferencia("IF007", "BD", Color.YELLOW));
            materiasPreferencias.put("Estadistica", new Preferencia("MA006", "E", Color.BLUE));
            materiasPreferencias.put("Programación Orientada a Objetos", new Preferencia("IF008", "POO", Color.DKGRAY));
            materiasPreferencias.put("Introducción a la Concurrencia", new Preferencia("IF038", "C", Color.BLACK));
            materiasPreferencias.put("Laboratorio de Programación y Lenguajes", new Preferencia("IF009", "LPyL", Color.GRAY));
            materiasPreferencias.put("Sistemas Operativos - S", new Preferencia("IF037", "SO", Color.YELLOW));
            materiasPreferencias.put("Ingenieria de Software I - T", new Preferencia("IF040", "IST", Color.CYAN));
            materiasPreferencias.put("Desarrollo de Software", new Preferencia("IF012", "D", Color.RED));
            materiasPreferencias.put("Ingenieria de Software II - T", new Preferencia("IF043", "IS2", Color.LTGRAY));
            materiasPreferencias.put("Fundamentos Teóricos de Informática", new Preferencia("IF013", "F", Color.GREEN));
            materiasPreferencias.put("Redes y Transmisión de Datos", new Preferencia("479kq0gffslu7jivobkgpu9aj4@group.calendar.google.com", "IF019", "R", Color.MAGENTA));
            materiasPreferencias.put("Base de Datos II", new Preferencia("IF044", "BDII", Color.YELLOW));
            materiasPreferencias.put("Paradigmas y Lenguajes de Programación - T", new Preferencia("IF020", "PyLP", Color.BLACK));
            materiasPreferencias.put("Administración de Redes y Seguridad", new Preferencia("IF046", "ARyS", Color.CYAN));
            materiasPreferencias.put("Ingenieria de Software III - T", new Preferencia("IF047", "IS3", Color.MAGENTA));
            materiasPreferencias.put("Aspectos Legales y Profesionales", new Preferencia("IF016", "ALyP", Color.LTGRAY));
            materiasPreferencias.put("Sistemas Distribuidos", new Preferencia("IF022", "SD", Color.BLUE));
            materiasPreferencias.put("Administración de Proyectos", new Preferencia("IF049", "AP", Color.GREEN));
            materiasPreferencias.put("Aplicaciones Web", new Preferencia("IF050", "AW", Color.YELLOW));
            materiasPreferencias.put("Taller de Nuevas Tecnologias", new Preferencia("q4sjke29116cd0ld3275p9ch9g@group.calendar.google.com", "IF017", "TNT", Color.RED));
            materiasPreferencias.put("Modelos y Simulación", new Preferencia("IF027", "MyS", Color.CYAN));
            materiasPreferencias.put("Planificación y Gestión de Sistemas de Información", new Preferencia("IF053", "PSI", Color.DKGRAY));
            materiasPreferencias.put("Sistemas de Soporte para la Toma de Decisiones", new Preferencia("IF054", "SSTD", Color.MAGENTA));
            materiasPreferencias.put("Introducción a la Metodología de la Investigación Científica y Técnicas Comunicacionales", new Preferencia("FA104", "TC", Color.GRAY));
        }
    }

    /**
     * Metodo que retorna una lista completa de los nombres de las materias.
     * @return String[] - Lista de String que representan a las materias
     */
    public static String[] getMaterias(){
        return materias;
    }

    /**
     * Metodo estatico que arma un HashMap con las materias y sus correspondientes calendarios de acuerdo a las preferencias
     * del usuario
     * @param pref SharedPreferences
     * @return HashMap con las materias y sus correspondientes calendarios de acuerdo a las preferencias
     */
    public static Map<String, String> armarPreferencias(SharedPreferences pref){
        inicializar();
        Map<String, String> preferencias = new HashMap<String, String>();
        String id;
        ArrayList<String> materias = getPreferencias(pref);
        for (String materia: materias){
            id = materiasPreferencias.get(materia).getCalendario();
            if (id != null){
                preferencias.put(materia, id);
            }
        }
        return preferencias;
    }

    /**
     * Metodo estatico que arma un listado con las materias de preferencias del usuario
     * @param pref SharedPreferences
     * @return ArrayList de String que representa el listado de preferencias del usuario
     */
    public static ArrayList<String> getPreferencias(SharedPreferences pref){
        ArrayList<String> preferencias = new ArrayList<String>();
        for (String materia: getMaterias()) {
            if (pref.getBoolean(materia,false)){
                preferencias.add(materia);
            }
        }
        return preferencias;
    }

    /**
     * Metodo que dada una materia, retorna su codigo
     * @param materia String que representa el nombre de la materia
     * @return String que representa el codigo de la materia pasada como parametro
     */
    @Nullable
    public static String getCodigoMateria(String materia){
        inicializar();
        String codigo = materiasPreferencias.get(materia).getCodMateria();
        if (codigo != null){
            return codigo;
        }
        return null;
    }

    /**
     * Metodo que retorna el color con el que se mostrara la materia
     * @param materia String que representa el nombre de la materia
     * @return int que representa el color que tendra la materia cuando se muestre al usuario
     */
    public static int getColor(String materia){
        return materiasPreferencias.get(materia).getColor();
    }

    /**
     * Metodo que retorna las iniciales de la materia
     * @param materia String que representa el nombre de la materia
     * @return String que representa las iniciales de la materia
     */
    public static String getIniciales(String materia){
        return materiasPreferencias.get(materia).getInicial();
    }
}
