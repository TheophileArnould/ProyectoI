package Mercado;


import Mercado.Graphics.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App { // Create user interface

    private MainMercado mercadoView = new MainMercado();
    private JeanView jeanView = new JeanView();
    private Carrito carrito = new Carrito();
    private CarritoView carritoView = new CarritoView(carrito);
    private CamisaView camisaView = new CamisaView();
    private VestidoView vestidoView = new VestidoView();
    private CamisetaView camisetaView = new CamisetaView();


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
                camisetaView.setContentPane(camisetaView.getPanelMain());
                camisetaView.setTitle("Hello");
                camisetaView.setSize(1200,800);
                camisetaView.setVisible(true);
                camisetaView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mercadoView.setVisible(false);
            }
        });
        mercadoView.getVestido().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                vestidoView.setContentPane(vestidoView.getPanelMain());
                vestidoView.setTitle("Hello");
                vestidoView.setSize(1200,800);
                vestidoView.setVisible(true);
                vestidoView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mercadoView.setVisible(false);
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
        vestidoView.getVolverButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mercadoView.setVisible(true);
                vestidoView.setVisible(false);
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
        camisetaView.getVolverButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mercadoView.setVisible(true);
                camisetaView.setVisible(false);
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
        vestidoView.getAgreagarAlCarritoButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                carrito.addToCarrito(vestidoView.CreateRopa());
                carritoView.updateCarrito();
                mercadoView.setVisible(true);
                vestidoView.setVisible(false);
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
        camisetaView.getAgreagarAlCarritoButton().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                carrito.addToCarrito(camisetaView.CreateRopa());
                carritoView.updateCarrito();
                mercadoView.setVisible(true);
                camisetaView.setVisible(false);
            }
        });
    }


}
