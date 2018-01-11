# Image Zoom Popup

ImageView with popup

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
