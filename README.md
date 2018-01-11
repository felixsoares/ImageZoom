# Image Zoom Popup

ImageView with popup
When user click on ImageZoom will display popup with large image

![](https://image.ibb.co/jhVQgm/img1.jpg) ![](https://image.ibb.co/e5V2SR/img2.jpg) ![](https://image.ibb.co/n5f2SR/img3.jpg)

### Getting Started

Add it in your root build.gradle (Project module)

```gradle
allprojects {
   repositories {
        ...
        maven { url 'https://jitpack.io' }
   }
}
```

Add the dependency in build.gradle (App module)

```gradle
dependencies {
	compile 'com.github.felixsoares:ImageZoom:1.0'
}
```

## Usage example

In layout file

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <br.com.felix.imagezoom.ImageZoom
		android:id="@+id/img1"
		android:adjustViewBounds="true"
		android:src="@drawable/the_rock"
		android:layout_width="50dp"
		android:layout_height="50dp" />

</RelativeLayout>
```

In Activity or Fragment

```java
ImageZoom imageZoom = findViewById(R.id.img1);
```

### Documentation

1) Dont put ClickListener on ImageZoom

2) Support Bitmap

```java
ImageZoom imageZoom = findViewById(R.id.img1);
imageZoom.setImageBitmap(thumbnail);
```

MIT License

Copyright (c) [year] [fullname]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
