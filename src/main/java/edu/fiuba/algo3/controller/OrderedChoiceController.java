package edu.fiuba.algo3.controller;

import edu.fiuba.algo3.modelo.Constants.Constants;
import edu.fiuba.algo3.modelo.Opcion.Opcion;
import edu.fiuba.algo3.modelo.Opcion.OpcionSinGrupo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OrderedChoiceController extends GeneralPreguntaController{

    @FXML
    Button opcionUno;

    @FXML
    Button opcionDos;

    @FXML
    Button opcionTres;

    @FXML
    Button opcionCuatro;

    @FXML
    Button opcionCinco;

    private List<Button> listaBotones = new ArrayList<>();

    private int cantidadOpciones = 0;
    private static String seleccionado = "-fx-background-color: #801336; -fx-text-fill: WHITE";
    private static String noSeleccionado = "-fx-background-color: #5a441b; -fx-text-fill: BLACK";

    protected void setUp(){
        iniciarBotones();
    }

    private void iniciarBotones(){

        listaBotones.add(opcionUno);
        listaBotones.add(opcionDos);
        listaBotones.add(opcionTres);
        listaBotones.add(opcionCuatro);
        listaBotones.add(opcionCinco);

        List<Opcion> opcionesPregunta = rondaActual.getOpciones();


        for(Opcion opcion : opcionesPregunta){
            listaBotones.get(cantidadOpciones).setText(opcion.getTexto());
            cantidadOpciones++;
        }

        for (int j = cantidadOpciones; j < Constants.CANTIDAD_MAXIMA_OPCIONES; j++) {
            listaBotones.get(j).setVisible(false);
        }
    }

    public void onOpcionUno(){

        OpcionSinGrupo opcion = new OpcionSinGrupo(opcionUno.getText());
        if (opcionesSeleccionadas.contains(opcion)){
            opcionesSeleccionadas.remove(opcionesSeleccionadas.indexOf(opcion));
            opcionUno.setStyle(seleccionado);
        } else {
            opcionesSeleccionadas.add(opcion);
            opcionUno.setStyle(noSeleccionado);
        }
    }

    public void onOpcionDos(){

        OpcionSinGrupo opcion = new OpcionSinGrupo(opcionDos.getText());
        if (opcionesSeleccionadas.contains(opcion)){
            opcionesSeleccionadas.remove(opcionesSeleccionadas.indexOf(opcion));
            opcionUno.setStyle(seleccionado);
        } else {
            opcionesSeleccionadas.add(opcion);
            opcionDos.setStyle(noSeleccionado);
        }
    }

    public void onOpcionTres(){

        OpcionSinGrupo opcion = new OpcionSinGrupo(opcionTres.getText());
        if (opcionesSeleccionadas.contains(opcion)){
            opcionesSeleccionadas.remove(opcionesSeleccionadas.indexOf(opcion));
            opcionUno.setStyle(seleccionado);
        } else {
            opcionesSeleccionadas.add(opcion);
            opcionTres.setStyle(noSeleccionado);
        }
    }

    public void onOpcionCuatro(){

        OpcionSinGrupo opcion = new OpcionSinGrupo(opcionCuatro.getText());
        if (opcionesSeleccionadas.contains(opcion)){
            opcionesSeleccionadas.remove(opcionesSeleccionadas.indexOf(opcion));
            opcionUno.setStyle(seleccionado);
        } else {
            opcionesSeleccionadas.add(opcion);
            opcionCuatro.setStyle(noSeleccionado);
        }
    }

    public void onOpcionCinco(){

        OpcionSinGrupo opcion = new OpcionSinGrupo(opcionCinco.getText());
        if (opcionesSeleccionadas.contains(opcion)){
            opcionesSeleccionadas.remove(opcionesSeleccionadas.indexOf(opcion));
            opcionUno.setStyle(seleccionado);
        } else {
            opcionesSeleccionadas.add(opcion);
            opcionCinco.setStyle(noSeleccionado);
        }
    }
}
