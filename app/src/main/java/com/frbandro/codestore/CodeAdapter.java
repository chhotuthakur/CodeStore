package com.frbandro.codestore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class CodeAdapter extends FirebaseRecyclerAdapter<CodeModel,CodeAdapter.CodeViewHolder> {


    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public CodeAdapter(@NonNull FirebaseRecyclerOptions<CodeModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull CodeAdapter.CodeViewHolder holder, int position, @NonNull CodeModel model) {

        holder.a.setText(model.getXmlcode());
        holder.b.setText(model.getJavacode());

    }

    @NonNull
    @Override
    public CodeAdapter.CodeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view

                = LayoutInflater.from(parent.getContext()).inflate(R.layout.show_data_rv, parent, false);

        return new CodeAdapter.CodeViewHolder(view);
    }

    public class CodeViewHolder extends RecyclerView.ViewHolder {
        EditText a,b;

        public CodeViewHolder(@NonNull View itemView) {
            super(itemView);

            a=itemView.findViewById(R.id.codexml);
            b=itemView.findViewById(R.id.codejava);
        }
    }
}
