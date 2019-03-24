package com.example.gyk301;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class FotografVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotograf_video);
    }

    public void FotografCek(View view) {
        Intent i= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,0); // buradaki 0 önemsiz bir rakam ama birazdan video çekerken ona 0 dan farklı değer vermemiz gerekiyor.
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode){
            case 0:

                Bitmap bitmap = (Bitmap)data.getExtras().get("data");
                ImageView imageView=(ImageView)findViewById(R.id.imageView);
                imageView.setImageBitmap(bitmap);
                //yukarıdaki 3 satır çekilen fotoğrafı imageView e basmaya yarıyor.
                break;

            case 1:  //Bu kodlar çekilen videoyu videoview e basmaya yarar.
                VideoView videoView=(VideoView)findViewById(R.id.videoview);
                videoView.setVideoURI(data.getData());
                videoView.setMediaController(new MediaController(this));
                videoView.requestFocus();
                videoView.start();

                break;
        }

    }

    public void VideoCek(View view) {

        Intent takePicture= new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        startActivityForResult(takePicture,1);
    }
}
