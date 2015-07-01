package main.java.gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;

//@@author Sebastian Quek
public class OverviewLayoutController extends StackPane {
    @FXML
    private ListView<String> overviewList;

    private static final String OVERVIEW_LAYOUT_FXML = "/main/resources/layouts/Overview.fxml";

    public OverviewLayoutController(MainApp mainApp) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(OVERVIEW_LAYOUT_FXML));
        loader.setController(this);
        loader.setRoot(this);

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
