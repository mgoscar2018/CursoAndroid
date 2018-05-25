package mx.com.jardinreal.lesson2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

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
        int precio = calcularPrecio();
        mostrarMensaje(crearResumenOrden(precio));
    }

    /**
     * Calculates the price of the order.
     * @return precio total de la venta
     */
    private int calcularPrecio() {
        return cantidad * 5;
    }

    /*
    * Arma el resumen de la orden
     */
    private String crearResumenOrden (int precio) {
        Toast.makeText(getApplicationContext(), "¡Muchas gracias por tu compra!", Toast.LENGTH_SHORT).show(); //Muestra un mensaje temporal en pantalla
        return "Nombre: Oscar Miranda\n"+"Cantidad: "+cantidad+"\nTotal: $"+precio+"\n¡Gracias!";
    }

    /**
     * Este método muestra en pantalla el valor que reciba como "numero"
     * @param numero es la cantidad a desplegar en pantalla
     */
    private void display(int numero) {
        TextView quantityTextView = (TextView) findViewById(R.id.cantidad_text_view);
        quantityTextView.setText("" + numero);
    }

     /**
     * Este método despliega el texto que envíen dentro del contenedor de precio
     */
    private void mostrarMensaje(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.resumen_text_view);
        orderSummaryTextView.setText(message);
    }
}
