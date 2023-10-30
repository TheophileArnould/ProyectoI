package Mercado;


import Mercado.Graphics.CamisaView;
import Mercado.Graphics.CarritoView;
import Mercado.Graphics.JeanView;
import Mercado.Graphics.MainMercado;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App { // Create user interface

    private MainMercado mercadoView = new MainMercado();
    private JeanView jeanView = new JeanView();
    private Carrito carrito = new Carrito();
    private CarritoView carritoView = new CarritoView(carrito);
    private CamisaView camisaView = new CamisaView();


    public void dispMercado() {
        mercadoView.setContentPane(mercadoView.getPanelMain());
        mercadoView.setTitle("Hello");
        mercadoView.setSize(1200,800);
        mercadoView.setVisible(true);
        mercadoView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mercadoView.getPantalon().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jeanView.setContentPane(jeanView.getPanelMain());
                jeanView.setTitle("Hello");
                jeanView.setSize(1200,800);
                jeanView.setVisible(true);
                jeanView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mercadoView.setVisible(false);
            }
        });
        mercadoView.getCamisa().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                camisaView.setContentPane(camisaView.getPanelMain());
                camisaView.setTitle("Hello");
                camisaView.setSize(1200,800);
                camisaView.setVisible(true);
                camisaView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mercadoView.setVisible(false);
            }
        });
        mercadoView.getCamiseta().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        mercadoView.getVestido().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        mercadoView.getCarrito().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                carritoView.setContentPane(carritoView.getMainPanel());
                carritoView.setTitle("Hello");
                carritoView.setSize(1200,800);
                carritoView.setVisible(true);
                carritoView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mercadoView.setVisible(false);
            }
        });



        jeanView.getVolverButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mercadoView.setVisible(true);
                jeanView.setVisible(false);
            }
        });
        carritoView.getVolverButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mercadoView.setVisible(true);
                carritoView.setVisible(false);
            }
        });
        camisaView.getVolverButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mercadoView.setVisible(true);
                camisaView.setVisible(false);
            }
        });

        jeanView.getAgreagarAlCarritoButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                carrito.addToCarrito(jeanView.CreateRopa());
                carritoView.updateCarrito();
                mercadoView.setVisible(true);
                jeanView.setVisible(false);
            }
        });

        camisaView.getAgregarAlCarritoButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                carrito.addToCarrito(camisaView.CreateRopa());
                carritoView.updateCarrito();
                mercadoView.setVisible(true);
                camisaView.setVisible(false);
            }
        });
    }


}
