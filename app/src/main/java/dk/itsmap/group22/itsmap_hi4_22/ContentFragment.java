package dk.itsmap.group22.itsmap_hi4_22;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ContentFragment extends Fragment {

    public ContentFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_content, container, false);
    }

    public void setText(String text) {
        TextView textView = (TextView) getView().findViewById(R.id.content_fragment_textview);
        textView.setText(text);
    }
}
