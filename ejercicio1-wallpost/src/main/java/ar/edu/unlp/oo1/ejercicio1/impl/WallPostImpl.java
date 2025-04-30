package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean destacado;
	/**
	 * Complete con su implementación
	 */
	
	public WallPostImpl() {
		this.text = "Undefined post";
		this.likes = 0;
		this.destacado=false;
	}

	public String getText() {
		return this.text;
	}
	
	public void setText(String descriptionText) {
		this.text = descriptionText;
	}
	
	public int getLikes() {
		return this.likes;
	}
	
	public void like() {
		this.likes++;
	}
	
	public void dislike() {
		if(this.likes > 0) {
			this.likes--;
		}
	}
	
	public boolean isFeatured() {
		return this.destacado;
	}
	
	public void toggleFeatured() {	
		this.destacado = ! this.destacado; 
	}
	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }
    
    
     

}
