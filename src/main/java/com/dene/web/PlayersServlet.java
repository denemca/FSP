package com.dene.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dene.data.MockData;
import com.dene.player.Player;

/**
 * Servlet implementation class HelloWorldServlet
 */ 
@WebServlet("/players")
public class PlayersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PlayersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	MockData mockdata = new MockData();
    	List<Player> players = mockdata.getPlayers();
        PrintWriter out = response.getWriter();
        StringBuilder sb = new StringBuilder();
        for(Player player: players) {
        	sb.append(player.toString());
        }
        out.print("<html><body><table><tr><th>Name</th><th>Score</th><tr>" +
        
        sb.toString() + "</table></body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}