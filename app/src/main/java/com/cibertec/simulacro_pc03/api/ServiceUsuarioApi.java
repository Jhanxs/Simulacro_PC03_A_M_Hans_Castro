package com.cibertec.simulacro_pc03.api;

import com.cibertec.simulacro_pc03.entity.Usuario;

import java.util.List;
import java.util.Optional;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ServiceUsuarioApi {

    @GET("usuario")
    public abstract  Call<List<Usuario>> listaUsuario();

    @GET("usuario/{id}")
    public abstract  Call<Optional<Usuario>> buscaUsuario(String id);

    @POST("usuario")
    public abstract Call<Usuario> insertaUsuario(@Body Usuario obj);

    @PUT("usuario")
    public abstract Call<Usuario> actualizaRUsuario(@Body Usuario obj);

    @DELETE("usuario/{id}")
    public abstract Call<Usuario> eliminaUsuario(@Path("id")String id);


}