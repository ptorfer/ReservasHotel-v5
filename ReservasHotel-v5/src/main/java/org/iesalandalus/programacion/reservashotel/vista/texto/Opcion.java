package org.iesalandalus.programacion.reservashotel.vista.texto;

public enum Opcion {

    SALIR("Salir"){
        @Override
        public void ejecutar() {
            vistaTexto.terminar();}
    },

    INSERTAR_HUESPED("Insertar huésped"){
        @Override
        public void ejecutar() {
            vistaTexto.insertarHuesped();}
    },

    BUSCAR_HUESPED("Buscar huésped"){
        @Override
        public void ejecutar() {
            vistaTexto.buscarHuesped();}
    },

    BORRAR_HUESPED("Borrar huésped"){
        @Override
        public void ejecutar() {
            vistaTexto.borrarHuesped();}
    },

    MOSTRAR_HUESPEDES("Mostrar huéspedes"){
        @Override
        public void ejecutar() {
            vistaTexto.mostrarHuespedes();}
    },

    INSERTAR_HABITACION("Insertar habitación"){
        @Override
        public void ejecutar() {
            vistaTexto.insertarHabitacion();}
    },

    BUSCAR_HABITACION("Buscar habitación"){
        @Override
        public void ejecutar() {
            vistaTexto.buscarHabitacion();}
    },

    BORRAR_HABITACION("Borrar habitación"){
        @Override
        public void ejecutar() {
            vistaTexto.borrarHabitacion();}
    },

    MOSTRAR_HABITACIONES("Mostrar habitaciones"){
        @Override
        public void ejecutar() {
            vistaTexto.mostrarHabitaciones();}
    },

    INSERTAR_RESERVA("Insertar reserva"){
        @Override
        public void ejecutar() {
            vistaTexto.insertarReserva();}
    },

    ANULAR_RESERVA("Anular reserva"){
        @Override
        public void ejecutar() {
            vistaTexto.anularReserva();}
    },

    MOSTRAR_RESERVAS("Mostrar reservas"){
        @Override
        public void ejecutar() {
            vistaTexto.mostrarReservas();}
    },

    LISTAR_RESERVAS_HUESPED("Listar reservas huésped") {
        @Override
        public void ejecutar() {
            vistaTexto.mostrarReservasHuesped();}
    },
    LISTAR_RESERVAS_TIPO_HABITACION("Listar reservas tipo"
            + "habitación") {
        @Override
        public void ejecutar() {
            vistaTexto.mostrarReservasTipoHabitacion();}
    },

    CONSULTAR_DISPONIBILIDAD("Consultar disponibilidad"){
        @Override
        public void ejecutar() {
            vistaTexto.comprobarDisponibilidad();}
    },

    REALIZAR_CHECKIN("Realizar checkin"){
        @Override
        public void ejecutar() {
            vistaTexto.realizarCheckin();}
    },

    REALIZAR_CHECKOUT("Realizar checkout"){
        @Override
        public void ejecutar() {
            vistaTexto.realizarCheckOut();}
    };


    //Atributos

    private String mensajeAMostrar;
    private static VistaTexto vistaTexto;

    //Constructor

    Opcion (String mensajeAMostrar) {
        this.mensajeAMostrar = mensajeAMostrar;
    }

    protected static void setVista(VistaTexto vistaTexto) {
        Opcion.vistaTexto = vistaTexto;
    }

    public abstract void ejecutar();

    @Override
    public String toString(){
        return String.format("%d.-%s.",ordinal(),this.mensajeAMostrar);
    }

}
