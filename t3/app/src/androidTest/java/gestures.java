import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.t3.R;

public class gestures extends AppCompatActivity implements GestureDetector.OnGestureListener
{

    private static final String TAG = "Swipe Position";
    private float x1, x2, y1, y2;
    private static int MIN_DISTANCE = 5;
    private GestureDetector gestureDetector;

    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gestures);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        im=findViewById(R.id.imageView);
        //initialize gestureDetector
        this.gestureDetector = new GestureDetector(gestures.this, this);
    }


    // ovverride on touch event


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);

        switch (event.getAction()){

            // iniciando tiempo del gesto swipe
            case MotionEvent.ACTION_DOWN:
                x1=event.getX();
                y1=event.getY();
                break;
            // terminando el tiempo del gesto swipe
            case MotionEvent.ACTION_UP:
                x2=event.getX();
                y2=event.getY();

                float valueX = x2-x1;
                float valueY = y2-y1;

                if (Math.abs(valueX)> MIN_DISTANCE){
                    // detecta swipe izquierda a derecha
                    if (x2>x1)
                    {
                        //Toast.makeText(this,"Derecha es swipeada",Toast.LENGTH_LONG).show();
                        im.setImageResource(R.mipmap.suga_der);//cambiar a los suga
                    }
                    else
                    {
                        // Detecta swipe de derecha a izquierda
                        //Toast.makeText(this, "Inzquierda es swipeada", Toast.LENGTH_LONG).show();
                        im.setImageResource(R.mipmap.suga_izq);
                    }
                }
                else if (Math.abs(valueY) > MIN_DISTANCE) {
                    // Detecta abajo swipe
                    if (y2 > y1) {
                        //arriba to abajo swipe
                        //Toast.makeText(this, "Abajo es swipeada", Toast.LENGTH_LONG).show();
                        im.setImageResource(R.mipmap.suga_arri);
                    } else {
                        // Detecta abajo arriba swipe
                        //Toast.makeText(this, "Arriba es swipeada", Toast.LENGTH_LONG).show();
                        im.setImageResource(R.mipmap.suga_abajo);
                    }
                }
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}
