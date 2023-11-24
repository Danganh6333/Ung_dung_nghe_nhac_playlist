package cuonghtph34430.poly.ung_dung_nghe_nhac_playlist.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import cuonghtph34430.poly.ung_dung_nghe_nhac_playlist.Adapter.ListSongAdapter;
import cuonghtph34430.poly.ung_dung_nghe_nhac_playlist.Choinhac;
import cuonghtph34430.poly.ung_dung_nghe_nhac_playlist.Model.ListSong;
import cuonghtph34430.poly.ung_dung_nghe_nhac_playlist.R;

public class fragment_popular_songs extends Fragment {
    ListSongAdapter nhacAdapter;
    ListSong nhac;
    ArrayList<ListSong> listN;
    ListView lv_nhac;
    View view;
    Context context;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_popular_song,container,false);
        lv_nhac = view.findViewById(R.id.popular_song);

        context = getContext(); // hoặc getActivity()
        listN = new ArrayList<ListSong>();
        listN.add(new ListSong("Em đồng ý","kkkkk",R.drawable.anh_1,R.raw.emdongy,1,1));
        listN.add(new ListSong("Gió","ppppp",R.drawable.anh_2,R.raw.gio_lofi,1,1));
        listN.add(new ListSong("Là anh","gggggg",R.drawable.anh_3,R.raw.la_anh,1,1));
        listN.add(new ListSong("Từng quen","ooooo",R.drawable.anh_5,R.raw.tung_quen,1,1));

        nhacAdapter = new ListSongAdapter(context,listN);
        lv_nhac.setAdapter(nhacAdapter);

        lv_nhac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListSong nhac = listN.get(position);
                Intent openMusicPlayer = new Intent(getContext(), Choinhac.class);
                openMusicPlayer.putExtra("nhac", nhac); // Truyền đối tượng ListSong thay vì chỉ truyền file nhạc
                startActivity(openMusicPlayer);
            }
        });
        return view;
    }
}