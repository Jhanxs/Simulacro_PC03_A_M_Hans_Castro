package com.cibertec.simulacro_pc03.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cibertec.simulacro_pc03.R;
import com.cibertec.simulacro_pc03.entity.Usuario;

import java.util.List;

public class UsuarioAdapter extends ArrayAdapter<Usuario> {

    private Context context;
    private List<Usuario> lista;

    public UsuarioAdapter(@NonNull Context context, int resource,  @NonNull List<Usuario> lista) {
        super(context, resource,  lista);
        this.context = context;
        this.lista = lista;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.activity_usuario_crud_item, parent, false);

        Usuario obj = lista.get(position);

        TextView txtNombre = row.findViewById(R.id.idItemCrudUsuarioNombre);
        txtNombre.setText(obj.getNombre());

        return row;
    }
}
