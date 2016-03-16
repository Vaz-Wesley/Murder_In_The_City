/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.murderInTheCity.control;

import byu.cit260.murderInTheCity.model.PiecesOfEvidence;

/**
 *
 * @author Wesley Vaz_2
 */

public class PiecesOfEvidenceControl {
    
    public enum Evidences{
        knife,
        blood;
    }
    
    public static PiecesOfEvidence[] createPiecesOfEvidence(){
        
        PiecesOfEvidence[] piecesOfEvidence = new PiecesOfEvidence[50];
        
        PiecesOfEvidence knife = new PiecesOfEvidence();
        knife.setEvidenceName("Knife");
        knife.setEvidenceType("Object");
        knife.setEvidenceOrigin("Kid Mania Park");
        piecesOfEvidence[Evidences.knife.ordinal()] = knife;
        
        PiecesOfEvidence blood = new PiecesOfEvidence();
        blood.setEvidenceName("Blood");
        blood.setEvidenceType("Organic");
        blood.setEvidenceOrigin("Kid Mania Park");
        piecesOfEvidence[Evidences.blood.ordinal()] = blood;
        
        return piecesOfEvidence;
    }
}
