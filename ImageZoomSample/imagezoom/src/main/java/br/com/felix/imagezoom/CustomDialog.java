package br.com.felix.imagezoom;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.Window;
import android.widget.ImageView;

/**
 * Created by user on 10/01/2018.
 */

public class CustomDialog {

    public static void show(Context context, Bitmap bitmap) {
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.custom_dialog);

        ImageView imageView = dialog.findViewById(R.id.imageview);
        imageView.setImageBitmap(bitmap);

        dialog.show();
    }
}
