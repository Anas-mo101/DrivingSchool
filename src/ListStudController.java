

import javafx.application.Application;


import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;




public class ListStudController extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {


        primaryStage.setTitle("List of Students");

        ListView listStudent = new ListView();

        listStudent.getItems().add("Lee Ting Wei");
        listStudent.getItems().add("Muhammad Adam Mukhriz");
        listStudent.getItems().add("Siti Qaisara bt Md zul");
        listStudent.getItems().add("Jazmine Sophea");
        listStudent.getItems().add("Dhiviyaa A/P Kumar");
        listStudent.getItems().add("Alya Maisarah bt Muazam");
        listStudent.getItems().add("Jason Yap");
        listStudent.getItems().add("Hariz Luqman");
        listStudent.getItems().add("Syazwina Suhaimi");
        listStudent.getItems().add("Muhammad Luqman Hakim ");
        listStudent.getItems().add("Anthony Loke Rueben");
        listStudent.getItems().add("Aliyah Sofiyah ");
        listStudent.getItems().add("Abdul Khatab ");
        listStudent.getItems().add("William Ong");
        listStudent.getItems().add("Nor Ilyana Norzali");
        listStudent.getItems().add("Muhammad Ghufran");

        HBox hbox = new HBox(listStudent);

        Scene scene = new Scene(hbox, 300, 120);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void setUserdata(String[] examData) {

    }
}


