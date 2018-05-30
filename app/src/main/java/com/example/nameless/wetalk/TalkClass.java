package com.example.nameless.wetalk;

/**
 * Created by Nameless on 5/30/2018.
 */

public class TalkClass {

    private  String nomeUser , legenda , fotoTalk;
    private int like;

    public TalkClass() {
    }

    public TalkClass(String nomeUser, String legenda, String fotoTalk, int like) {
        this.nomeUser = nomeUser;
        this.legenda = legenda;
        this.fotoTalk = fotoTalk;
        this.like = like;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public String getFotoTalk() {
        return fotoTalk;
    }

    public void setFotoTalk(String fotoTalk) {
        this.fotoTalk = fotoTalk;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
