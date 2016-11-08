package com.nostra13.universalimageloader.core.display;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.imageaware.ImageViewAware;

/**
 * Fake displayer which doesn't display Bitmap in ImageView. Should be used in {@linkplain DisplayImageOptions display
 * options} for
 * {@link ImageLoader#loadImage(String, com.nostra13.universalimageloader.core.assist.ImageSize, DisplayImageOptions, com.nostra13.universalimageloader.core.assist.ImageLoadingListener)}
 * ImageLoader.loadImage()}
 *
 * @author Sergey Tarasevich (nostra13[at]gmail[dot]com)
 * @since 1.6.0
 */
public final class FakeBitmapDisplayer implements BitmapDisplayer {

	@Override
	public void display(Bitmap bitmap, ImageAware imageAware, LoadedFrom loadedFrom) {
	}

	public Bitmap display(Bitmap bitmap, ImageView imageView, LoadedFrom loadedFrom) {
		// Do nothing
		return bitmap;
	}
}
