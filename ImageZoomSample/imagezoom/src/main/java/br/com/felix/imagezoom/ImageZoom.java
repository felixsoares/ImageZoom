package br.com.felix.imagezoom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by user on 10/01/2018.
 */

public class ImageZoom extends AppCompatImageView implements View.OnClickListener {

    public ImageZoom(Context context) {
        super(context);
        setOnClickListener(this);
    }

    public ImageZoom(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnClickListener(this);
    }

    public ImageZoom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (getDrawable() != null)
            CustomDialog.show(getContext(), ((BitmapDrawable) getDrawable()).getBitmap());
    }
}
