package com.example.nameless.wetalk;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Vector;

/**
 * Created by Nameless on 5/23/2018.
 */

public class WTalkAdapter extends RecyclerView.Adapter<WTalkAdapter.MyViewHolder> {

    private List<TalkClass> listaPosts;
    private LayoutInflater inflater;
    Context context;


    public WTalkAdapter(Context context) {
        this.listaPosts = new Vector<>();
        this.inflater = LayoutInflater.from(context);
    }
    public void add(TalkClass talkClass){
        listaPosts.add(talkClass);
        notifyDataSetChanged();
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_list,parent,false);
        WTalkAdapter.MyViewHolder holder = new WTalkAdapter.MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(WTalkAdapter.MyViewHolder holder, int position) {
        TalkClass talkCorrente = listaPosts.get(position);
        talkCorrente.setLegenda("sfsfsf");
        talkCorrente.setLike(5);
        talkCorrente.setNomeUser("Bitch Ass Nigger B!tch");
        holder.setData(talkCorrente,position);
        notifyDataSetChanged();
        /*holder.nomeUsuario.setText(postActual.getSender());
        holder.statusFoto.setText(postActual.getText());
*/


    }


    @Override
    public int getItemCount() {
        return listaPosts.size();
    }
    public List<TalkClass> getList() {
        return listaPosts;
    }

    // SEGUNDA CLASS

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageProfile ;
        TextView nomeUsuario, legenda;
        private int position;
       TalkClass talkCorrente;

        public MyViewHolder(View view) {
            super(view);

            nomeUsuario = (TextView) itemView.findViewById(R.id.nomeUsuario);
            imageProfile = (ImageView) itemView.findViewById(R.id.image_feed);
            legenda = (TextView) itemView.findViewById(R.id.legenda);

        }


        public void setData(TalkClass talkCorrente, int position) {

            this.nomeUsuario.setText(talkCorrente.getNomeUser());
            this.legenda.setText(talkCorrente.getLegenda());
            if (talkCorrente.getFotoTalk() != null) {

              //imageProfile.setImageURI(Uri.parse(postActual.getPhotoUri()));
                //this.imageProfile.setImageURI(Uri.parse(postActual.getPhotoUri()));
               // Picasso.with(inflater.getContext()).load(talkCorrente.getFotoTalk()).into(this.imageProfile);
            }


        listaPosts.add(talkCorrente);
            this.position = position;
            this.talkCorrente = talkCorrente;
//                notifyDataSetChanged();

            //listaUsuarios.add(position,usaurioActual);



        }
    }
}
