package tomerbu.edu.galleryfragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {
    ImageView ivGallery;

    //Factory method:
    public static GalleryFragment newInstance(int imageResID) {

        GalleryFragment fragment = new GalleryFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("ImageResId", imageResID);

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_gallery, container, false);


        Bundle args = getArguments();
        int imageResId = args.getInt("ImageResId");

        ivGallery = (ImageView) v.findViewById(R.id.imageViewGallery);
        ivGallery.setImageResource(imageResId);

        return v;
    }

}
