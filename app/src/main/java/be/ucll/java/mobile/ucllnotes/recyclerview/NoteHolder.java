package be.ucll.java.mobile.ucllnotes.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import be.ucll.java.mobile.ucllnotes.R;

public class NoteHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView txtRVTitle;
    private NoteClick noteClick;

    // Constructor
    public NoteHolder(View itemView, NoteClick noteClick) {
        super(itemView);

        txtRVTitle = itemView.findViewById(R.id.txtRVTitle);
        this.noteClick = noteClick;

        itemView.setOnClickListener(this);
    }

    // Het afhandelen van de onClick gebeurt door het NoteListFragment omdat er vandaar
    // naar een ander fragment genavigeerd moet worden.
    @Override
    public void onClick(View view) {
        noteClick.onRVNoteClick(getAdapterPosition());
    }

    public TextView getTxtRVTitle() {
        return txtRVTitle;
    }
}