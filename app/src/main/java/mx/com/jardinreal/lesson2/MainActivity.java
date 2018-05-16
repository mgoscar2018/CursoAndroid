package mx.com.jardinreal.lesson2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int cantidad = 2; //Variable global

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Este método es llamado cuando se pulsa sobre el botón "+"
     */
    public void agregar(View view) {
        cantidad++;
        display(cantidad);
    }

    /**
     * Este método es llamado cuando se pulsa sobre el botón "-"
     */
    public void quitar(View view) {
        cantidad--;
        display(cantidad);
    }

    /**
     * Este método es llamado cuando se presiona el botón ORDENAR
     */
    public void realizarOrden(View view) {
        //mostrarPrecio(5 * cantidad);
        String precioMensaje = "Total: $"+(5*cantidad)+"\n¡Gracias!";
        mostrarMensaje(precioMensaje);
    }

    /**
     * Este método muestra en pantalla el valor que reciba como "numero"
     */
    private void display(int numero) {
        TextView quantityTextView = (TextView) findViewById(R.id.cantidad_text_view);
        quantityTextView.setText("" + numero);
    }

    /**
     * Este método despliega en pantalla el precio indicado
     */
    private void mostrarPrecio(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.precio_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * Este método despliega el texto que envíen dentro del contenedor de precio
     */
    private void mostrarMensaje(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.precio_text_view);
        priceTextView.setText(message);
    }
}
