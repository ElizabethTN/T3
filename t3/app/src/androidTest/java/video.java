import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.t3.R;

public class video extends AppCompatActivity
{
    VideoView vd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_video);

        getSupportActionBar().hide();

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        vd = findViewById(R.id.videoView);

        vd.setMediaController(new MediaController(this));

        String loc = "android.resource://" + getPackageName() + "/" + R.raw.video;
    }
}
