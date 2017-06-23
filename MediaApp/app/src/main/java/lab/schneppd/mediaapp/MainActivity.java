package lab.schneppd.mediaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create global configuration and initialize ImageLoader with this config
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
        ImageLoader.getInstance().init(config);

    }

    public void Click_btnLaunchTest(View v) {
        // does something very interesting
        ImageLoader imageLoader = ImageLoader.getInstance(); // Get singleton instance
        ImageView ivDisplay1 = (ImageView) findViewById(R.id.ivDisplay1);
        ImageView ivDisplay2 = (ImageView) findViewById(R.id.ivDisplay2);
        String imageUri  ="assets://test-images/exemple-maps.png";
        // Load image, decode it to Bitmap and display Bitmap in ImageView (or any other view
        //	which implements ImageAware interface)
        imageLoader.displayImage(imageUri, ivDisplay1);

        Picasso.with(this).load("file:///android_asset/test-images/exemple-maps.png").into(ivDisplay2);
    }
}
