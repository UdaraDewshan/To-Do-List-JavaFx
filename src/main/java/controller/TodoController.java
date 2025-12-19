package controller;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;

public class TodoController {

    @FXML
    private JFXButton btnAddTask;

    @FXML
    private JFXButton btnColmpleted;

    @FXML
    private JFXButton btndelete;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private DatePicker completedDate;

    @FXML
    private DatePicker pendingDate;

}
