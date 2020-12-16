/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Miguel
 */
public class CeldaImagenTexto extends ListCell<Animal> {

    private VBox vertical_box;
    private ImageView imageView;
    private Label label;

    public CeldaImagenTexto() {
        vertical_box = new VBox();
        imageView = new ImageView();
        label = new Label();

        imageView.setPreserveRatio(true);
        imageView.setFitHeight(100);

        label.setWrapText(true);
        label.setAlignment(Pos.CENTER);
        this.setPrefWidth(super.getPrefWidth());

        vertical_box.getChildren().addAll(imageView, label);
        vertical_box.setAlignment(Pos.CENTER);
    }

    @Override
    protected void updateItem(Animal item, boolean empty) {
        super.updateItem(item, empty);
        if (item != null) {
            label.setText(item.getNombre());
            imageView.setImage(new Image(item.getImagenMiniatura()));
            setGraphic(vertical_box);
        }
    }

}