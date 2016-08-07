/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaexperto;

/**
 *
 * @author ALEX JAVIER
 */
import Rule.*;
public class reglas {
    BooleanRuleBase basedereglas = new BooleanRuleBase("basedereglas");
    
    RuleVariable Fiebre;
    RuleVariable TosMoco;
    RuleVariable TosSeca;
    RuleVariable DolorPecho;
    RuleVariable DolorGarganta;
    RuleVariable DificultadRespirar;
    RuleVariable DificultadRespirar1;
    RuleVariable DificultadRespirar2;
    RuleVariable DificultadRespirar3;        
    RuleVariable AfectadaNino;
    RuleVariable DolorFuertePecho;
    RuleVariable fiebreEscalofrio;
    RuleVariable tosConFlema;
    RuleVariable pequeñaCantidadDeFlema;
    RuleVariable SensacionDePresion;
    RuleVariable DolorAplastante;
    RuleVariable Sudoracion;
    RuleVariable SensacionFaltaDeAire;
    RuleVariable FaltaRespiracion;
    RuleVariable DolorAgudoPechoRespira;
    RuleVariable Trancaso;
    RuleVariable PresionEnElpecho;
    RuleVariable ActividadFisica;
    RuleVariable Tendinitis;
    RuleVariable MayorGrado;
    RuleVariable MenorGrado;
    RuleVariable Faringitis;
    RuleVariable Coslocondrites;
        
    RuleVariable resultadoFaringitis;
    RuleVariable resultadoMayorGrado;
    RuleVariable resultadoMenorGrado;
    RuleVariable resultadoFiebre;
    RuleVariable resultadoTrancaso;
    RuleVariable resultadoTosMoco;
    RuleVariable resultadoTosSeca;
    RuleVariable resultadoDolorPecho;
    RuleVariable resultadoDolorGarganta;
    RuleVariable resultadoDificultadRespirar;
    RuleVariable resultadoDificultadRespirar1;
    RuleVariable resultadoDificultadRespirar2;
    RuleVariable resultadoDificultadRespirar3;
    RuleVariable resultadoAfectadaNino;
    RuleVariable resultadoDolorFuertePecho;
    RuleVariable resultadofiebreEscalofrio;
    RuleVariable resultadotosConFlema;
    RuleVariable resultadopequeñaCantidadDeFlema;
    RuleVariable resultadoSensacionDePresion;
    RuleVariable resultadoDolorAplastante;
    RuleVariable resultadoSudoracion;
    RuleVariable resultadoSensacionFaltaDeAire;
    RuleVariable resultadoFaltaRespiracion;
    RuleVariable resultadoDolorAgudoPechoRespira;
    RuleVariable resultadoPresionEnElpecho;
    RuleVariable resultadoActividadFisica;   

    
    RuleVariable resultadoCoslocondrites;
    RuleVariable resultadoTendinitis;
   
    RuleVariable Casos;
    RuleVariable ResultadoCasos;
   
   
    String resultado="";
    
    public String obtenerEnfermedad(String caso)
    {
        basedeconocimiento();
        Casos.setValue(caso);
        basedereglas.forwardChain();
        resultado = ResultadoCasos.getValue();
        return resultado;
    }
    
    public String obtenerNiño(String afectadaNino)
    {
        basedeconocimiento();
        AfectadaNino.setValue(afectadaNino);
        basedereglas.forwardChain();
        resultado = resultadoAfectadaNino.getValue();
        return resultado;
    }
    // Si fiebre
    public String obtenerFiebre(String resultadoafectadaNino)
    {
        basedeconocimiento();
        Fiebre.setValue(resultadoafectadaNino);
        basedereglas.forwardChain();
        resultado = resultadoFiebre.getValue();
        return resultado;
    }
    
    //Si fiebre si tosMoco
    public String obtenerTosMoco(String resultadoafiebre)
    {
        basedeconocimiento();
        TosMoco.setValue(resultadoafiebre);
        basedereglas.forwardChain();
        resultado = resultadoTosMoco.getValue();
        return resultado;
    }
    
    //Si fiebre si tosMoso si dificultadRespirar
    public String obtenerDificultadRespirar(String resultadodificultadrespirar)
    {
        basedeconocimiento();
        DificultadRespirar.setValue(resultadodificultadrespirar);
        basedereglas.forwardChain();
        resultado = resultadoDificultadRespirar.getValue();
        
        return resultado;
    }
    
    public String obtenerTendinitis(String resultadodificultadrespirar)
    {
        basedeconocimiento();
        Tendinitis.setValue(resultadodificultadrespirar);
        basedereglas.forwardChain();
        resultado = resultadoTendinitis.getValue();
        
        return resultado;
    }
    
    public String obtenerDificultadRespirar1(String resultadodificultadrespirar1)
    {
        basedeconocimiento();
        DificultadRespirar1.setValue(resultadodificultadrespirar1);
        basedereglas.forwardChain();
        resultado = resultadoDificultadRespirar1.getValue();
        
        return resultado;
    }
    
    public String obtenerDificultadRespirar2(String resultadodificultadrespirar)
    {
        basedeconocimiento();
        DificultadRespirar2.setValue(resultadodificultadrespirar);
        basedereglas.forwardChain();
        resultado = resultadoDificultadRespirar2.getValue();
        
        return resultado;
    }
    
    //Si fiebre si dolor garganta
public String obtenerDolorGarganta(String resultadoafiebre)
    {
        basedeconocimiento();
        DolorGarganta.setValue(resultadoafiebre);
        basedereglas.forwardChain();
        resultado = resultadoDolorGarganta.getValue();
        return resultado;
    }
    

    //Si fiebre si dolor garganta si dificultad respirar
   public String obtenerDolorPecho(String resultadoDolorpecho)
    {
        basedeconocimiento();
        DolorPecho.setValue(resultadoDolorpecho);
        basedereglas.forwardChain();
        resultado = resultadoDolorPecho.getValue();
        return resultado;
    }
    
    //No fiebre si tos seca
   public String obtenerTosSeca(String resultadificultadrespirar)
    {
        basedeconocimiento();
        TosSeca.setValue(resultadificultadrespirar);
        basedereglas.forwardChain();
        resultado = resultadoTosSeca.getValue();
        return resultado;
    }

   public String obtenerDolorFuertePecho(String resultadoDolorfuertePecho)
    {
        basedeconocimiento();
        DolorFuertePecho.setValue(resultadoDolorfuertePecho);
        basedereglas.forwardChain();
        resultado = resultadoDolorFuertePecho.getValue();
        return resultado;
    }
 
   public String obtenerTieneEscalofrioMucosidad(String resultadotieneEscalofrioMucosidad)
    {
        basedeconocimiento();
        fiebreEscalofrio.setValue(resultadotieneEscalofrioMucosidad);
        basedereglas.forwardChain();
        resultado = resultadofiebreEscalofrio.getValue();
        return resultado;
    }

    public String obtenertosconFlema(String resultadotieneDolorFuertePecho)
    {
        basedeconocimiento();
        tosConFlema.setValue(resultadotieneDolorFuertePecho);
        basedereglas.forwardChain();
        resultado = resultadotosConFlema.getValue();
        return resultado;
    }

    public String obtenerFlema(String resultadotieneTosConFlema)
    {
        basedeconocimiento();
        pequeñaCantidadDeFlema.setValue(resultadotieneTosConFlema);
        basedereglas.forwardChain();
        resultado = resultadopequeñaCantidadDeFlema.getValue();
        return resultado;
    }

        public String obtenerPresionPecho(String resultadoPresionPecho)
    {
        basedeconocimiento();
        PresionEnElpecho.setValue(resultadoPresionPecho);
        basedereglas.forwardChain();
        resultado = resultadoPresionEnElpecho.getValue();
        return resultado;
    }

    public String obtenerSensacionPresion(String resultadoPresionSensacion)
    {
        basedeconocimiento();
        SensacionDePresion.setValue(resultadoPresionSensacion);
        basedereglas.forwardChain();
        resultado = resultadoSensacionDePresion.getValue();
        return resultado;
    }

    public String obtenerDolorAplastante(String resultadoDolorAplasta)
    {
        basedeconocimiento();
        DolorAplastante.setValue(resultadoDolorAplasta);
        basedereglas.forwardChain();
        resultado = resultadoDolorAplastante.getValue();
        return resultado;
    }

    public String obtenerSudoracion(String resultadoSudora)
    {
        basedeconocimiento();
        Sudoracion.setValue(resultadoSudora);
        basedereglas.forwardChain();
        resultado = resultadoSudoracion.getValue();
        return resultado;
    }
    
    public String obtenerSensacion(String resultadoSensacion)
    {
        basedeconocimiento();
        SensacionFaltaDeAire.setValue(resultadoSensacion);
        basedereglas.forwardChain();
        resultado = resultadoSensacionFaltaDeAire.getValue();
        return resultado;
    }
        
    public String obtenerDificultadActivifisi(String resultadoDifiActiviFisi)
    {
        basedeconocimiento();
        ActividadFisica.setValue(resultadoDifiActiviFisi);
        basedereglas.forwardChain();
        resultado = resultadoActividadFisica.getValue();
        return resultado;
    }
    
    public String obtenerFaltaRespiracion(String resultadoDifiActiviFisi)
    {
        basedeconocimiento();
        FaltaRespiracion.setValue(resultadoDifiActiviFisi);
        basedereglas.forwardChain();
        resultado = resultadoFaltaRespiracion.getValue();
        return resultado;
    }
    
     public String obtenerDolorAgudoPecho(String resultadoDifiActiviFisi)
    {
        basedeconocimiento();
        DolorAgudoPechoRespira.setValue(resultadoDifiActiviFisi);
        basedereglas.forwardChain();
        resultado = resultadoDolorAgudoPechoRespira.getValue();
        return resultado;
    }
     
     public String obtenerTrancaso(String resultadoDifiActiviFisi)
    {
        basedeconocimiento();
        Trancaso.setValue(resultadoDifiActiviFisi);
        basedereglas.forwardChain();
        resultado = resultadoTrancaso.getValue();
        return resultado;
    }
     
      public String obtenerMayorMenor(String mayor, String menor)
    {
        basedeconocimiento();
        MayorGrado.setValue(mayor);
        MenorGrado.setValue(menor);
        basedereglas.forwardChain();
        resultado = resultadoMayorGrado.getValue();
        return resultado;
    }
      
    public String obtenerFaringitis(String mayor)
    {
        basedeconocimiento();
        Faringitis.setValue(mayor);
        basedereglas.forwardChain();
        resultado = resultadoFaringitis.getValue();
        return resultado;
    }
     
      public String obtenerCoslocondrites(String mayor)
    {
        basedeconocimiento();
        Coslocondrites.setValue(mayor);
        basedereglas.forwardChain();
        resultado = resultadoCoslocondrites.getValue();
        return resultado;
    }
     
    public void basedeconocimiento()
    {
    Casos = new RuleVariable(basedereglas, "");
    ResultadoCasos = new RuleVariable(basedereglas, "");
    Tendinitis = new RuleVariable(basedereglas, "");
    
    Fiebre = new RuleVariable(basedereglas, "");

    TosMoco= new RuleVariable(basedereglas, "");
    TosSeca= new RuleVariable(basedereglas, "");
    DolorPecho= new RuleVariable(basedereglas, "");
    DolorGarganta= new RuleVariable(basedereglas, "");
    DificultadRespirar= new RuleVariable(basedereglas, "");
    DificultadRespirar2= new RuleVariable(basedereglas, "");
    DificultadRespirar1= new RuleVariable(basedereglas, "");
    DificultadRespirar3= new RuleVariable(basedereglas, "");
    AfectadaNino= new RuleVariable(basedereglas, "");
    DolorFuertePecho= new RuleVariable(basedereglas, "");
    fiebreEscalofrio= new RuleVariable(basedereglas, "");
    tosConFlema= new RuleVariable(basedereglas, "");
    pequeñaCantidadDeFlema= new RuleVariable(basedereglas, "");
    SensacionDePresion= new RuleVariable(basedereglas, "");
    DolorAplastante= new RuleVariable(basedereglas, "");
    Sudoracion= new RuleVariable(basedereglas, "");
    SensacionFaltaDeAire= new RuleVariable(basedereglas, "");
    FaltaRespiracion= new RuleVariable(basedereglas, "");
    DolorAgudoPechoRespira= new RuleVariable(basedereglas, "");
    PresionEnElpecho= new RuleVariable(basedereglas, "");
    ActividadFisica= new RuleVariable(basedereglas, "");
    Trancaso= new RuleVariable(basedereglas, "");
    MenorGrado = new RuleVariable(basedereglas, "");
    MayorGrado = new RuleVariable(basedereglas, "");
    Faringitis = new RuleVariable(basedereglas, "");
    Coslocondrites = new RuleVariable(basedereglas, "");
    
    resultadoCoslocondrites = new RuleVariable(basedereglas, "");
    resultadoFaringitis= new RuleVariable(basedereglas, "");
    resultadoFiebre= new RuleVariable(basedereglas, "");
    resultadoTosMoco= new RuleVariable(basedereglas, "");
    resultadoTosSeca= new RuleVariable(basedereglas, "");
    resultadoDolorPecho= new RuleVariable(basedereglas, "");
    resultadoDolorGarganta= new RuleVariable(basedereglas, "");
    resultadoDificultadRespirar= new RuleVariable(basedereglas, "");
    resultadoDificultadRespirar1= new RuleVariable(basedereglas, "");
    resultadoDificultadRespirar2= new RuleVariable(basedereglas, "");
    resultadoDificultadRespirar3= new RuleVariable(basedereglas, "");
    resultadoAfectadaNino= new RuleVariable(basedereglas, "");
    resultadoDolorFuertePecho= new RuleVariable(basedereglas, "");
    resultadofiebreEscalofrio= new RuleVariable(basedereglas, "");
    resultadotosConFlema= new RuleVariable(basedereglas, "");
    resultadopequeñaCantidadDeFlema= new RuleVariable(basedereglas, "");
    resultadoSensacionDePresion= new RuleVariable(basedereglas, "");
    resultadoDolorAplastante= new RuleVariable(basedereglas, "");
    resultadoSudoracion= new RuleVariable(basedereglas, "");
    resultadoSensacionFaltaDeAire= new RuleVariable(basedereglas, "");
    resultadoFaltaRespiracion= new RuleVariable(basedereglas, "");
    resultadoDolorAgudoPechoRespira= new RuleVariable(basedereglas, "");
    resultadoPresionEnElpecho= new RuleVariable(basedereglas, "");
    resultadoActividadFisica= new RuleVariable(basedereglas, "");
    resultadoTendinitis= new RuleVariable(basedereglas, "");
    resultadoTrancaso= new RuleVariable(basedereglas, "");
    resultadoMayorGrado = new RuleVariable(basedereglas, "");
    resultadoMenorGrado = new RuleVariable(basedereglas, "");
    
        Condition igual = new Condition("=");
        
        Rule reglanino = new Rule(basedereglas,"reglaNiño",
                new Clause[]{
                    new Clause(AfectadaNino,igual,"si")},
                new Clause(resultadoAfectadaNino,igual,"fiebre"));
        
        Rule reglaFiebre = new Rule(basedereglas,"reglaFiebre",
                new Clause[]{
                    new Clause(Fiebre,igual,"si")},
                new Clause(resultadoFiebre,igual,"condiciones"));
        
        Rule reglaFiebreMayor = new Rule(basedereglas,"reglaFiebreMayor",
                new Clause[]{
                    new Clause(MayorGrado,igual,"si"),
                    new Clause(MenorGrado,igual,"no")},
                new Clause(resultadoMayorGrado,igual,"tosmoco"));

        Rule reglaFiebreMenor = new Rule(basedereglas,"reglaFiebreMenor",
                new Clause[]{
                    new Clause(MayorGrado,igual,"no"),
                    new Clause(MenorGrado,igual,"si")},
                new Clause(resultadoMayorGrado,igual,"Indicios de Gripe"));

        
        Rule reglaTosMoco = new Rule(basedereglas,"reglaTosMoco",
                new Clause[]{
                    new Clause(TosMoco,igual,"si")},
                new Clause(resultadoTosMoco,igual,"dificultadrespirar"));

       Rule reglaDificultadRespirar = new Rule(basedereglas,"reglaDificultadRespiracion",
                new Clause[]{
                    new Clause(DificultadRespirar,igual,"si")},
                new Clause(resultadoDificultadRespirar,igual,"Bronquitis"));
       
       Rule reglaDolorGarganta = new Rule(basedereglas,"reglaDolorGarganta",
                new Clause[]{
                    new Clause(DolorGarganta,igual,"si")},
                new Clause(resultadoDolorGarganta,igual,"dificultadRespirar"));
       
       Rule reglaDificultadRespirar1 = new Rule(basedereglas,"reglaDificultadRespiracion1",
                new Clause[]{
                    new Clause(DificultadRespirar1,igual,"si")},
                new Clause(resultadoDificultadRespirar1,igual,"Epiglotitis"));

        Rule reglaTosSeca = new Rule(basedereglas,"reglaTosSeca",
                new Clause[]{
                    new Clause(TosSeca,igual,"si")},
                new Clause(resultadoTosSeca,igual,"dificultadrespirar"));
              
       Rule reglaDificultadRespirar2 = new Rule(basedereglas,"reglaDificultadRespiracion2",
                new Clause[]{
                    new Clause(DificultadRespirar2,igual,"si")},
                new Clause(resultadoDificultadRespirar2,igual,"Asma"));

        Rule reglaDolorPecho = new Rule(basedereglas,"reglaDolorPecho",
                new Clause[]{
                    new Clause(DolorPecho,igual,"si")},
                new Clause(resultadoDolorPecho,igual,"Pleurecia"));

        Rule reglaDificultadRespirar3 = new Rule(basedereglas,"reglaDificultadRespiracion3",
                new Clause[]{
                    new Clause(DificultadRespirar3,igual,"si")},
                new Clause(resultadoDificultadRespirar3,igual,"Neumotorax"));

        Rule reglaDolorFuerte = new Rule(basedereglas,"reglaDolorFuerte",
                new Clause[]{
                    new Clause(DolorFuertePecho,igual,"si")},
                new Clause(resultadoDolorFuertePecho,igual,"Casos"));
        
         Rule reglaSensacionPresion = new Rule(basedereglas,"reglaSensacionPresion",
                new Clause[]{
                    new Clause(SensacionDePresion,igual,"si")},
                new Clause(resultadoSensacionDePresion,igual,"Ataque"));

         Rule reglaDolorAplastante = new Rule(basedereglas,"reglaDolorAplastante",
                new Clause[]{
                    new Clause(DolorAplastante,igual,"si")},
                new Clause(resultadoDolorAplastante,igual,"Ataque"));

         Rule reglaSudoracion = new Rule(basedereglas,"reglaSudoracion",
                new Clause[]{
                    new Clause(Sudoracion,igual,"si")},
                new Clause(resultadoSudoracion,igual,"Ataque"));

         Rule reglaFaltaAire = new Rule(basedereglas,"reglaFaltaAire",
                new Clause[]{
                    new Clause(SensacionFaltaDeAire,igual,"si")},
                new Clause(resultadoSensacionFaltaDeAire,igual,"Ataque"));

         Rule reglaFiebreEscaloFrio = new Rule(basedereglas,"reglaFiebreEscaloFrio",
                new Clause[]{
                    new Clause(fiebreEscalofrio,igual,"si")},
                new Clause(resultadofiebreEscalofrio,igual,"dificultadRespiracion"));

         Rule reglaDoloAgudo = new Rule(basedereglas,"reglaDolorAgudo",
                new Clause[]{
                    new Clause(DolorAgudoPechoRespira,igual,"si")},
                new Clause(resultadoDolorAgudoPechoRespira,igual,"Neumotorax"));

         Rule reglaDificultadFisica = new Rule(basedereglas,"reglaDificultadFisica",
                new Clause[]{
                    new Clause(ActividadFisica,igual,"si")},
                new Clause(resultadoActividadFisica,igual,"Insuficienicia Cardiaca"));

         Rule reglaTosFlema = new Rule(basedereglas,"reglaTosFlema",
                new Clause[]{
                    new Clause(tosConFlema,igual,"si")},
                new Clause(resultadotosConFlema,igual,"Neumonia"));

         Rule reglaCantidadFlema = new Rule(basedereglas,"reglacantidadFlema",
                new Clause[]{
                    new Clause(pequeñaCantidadDeFlema,igual,"si")},
                new Clause(resultadopequeñaCantidadDeFlema,igual,"Pleurecia"));

         Rule reglaPresion = new Rule(basedereglas,"reglaPresion",
                new Clause[]{
                    new Clause(PresionEnElpecho,igual,"si")},
                new Clause(resultadoPresionEnElpecho,igual,"Hiperventilacion"));

        Rule reglaTendinitis = new Rule(basedereglas,"reglaTendinitis",
                new Clause[]{
                    new Clause(Tendinitis,igual,"si")},
                new Clause(resultadoTendinitis,igual,"Tendinitis"));
        
        
        Rule reglaFaltaRespiracion = new Rule(basedereglas,"reglaFlataRespiracion",
                new Clause[]{
                    new Clause(FaltaRespiracion, igual ,"si")},
                   new Clause(resultadoFaltaRespiracion,igual,"Bronquitis"));

        Rule reglaTrancaso = new Rule(basedereglas,"reglaTrancaso",
                new Clause[]{
                    new Clause(Trancaso, igual ,"si")},
                   new Clause(resultadoTrancaso,igual,"Trancaso"));
        
         Rule reglaFaringitis = new Rule(basedereglas,"reglaFaringitis",
                new Clause[]{
                    new Clause(Faringitis, igual ,"si")},
                   new Clause(resultadoFaringitis,igual,"Faringitis"));
        
        
         Rule reglaCoslocondrites  = new Rule(basedereglas,"reglaCoslocondrites",
                new Clause[]{
                    new Clause(Coslocondrites , igual ,"si")},
                   new Clause(resultadoCoslocondrites ,igual,"Coslocondrites"));
        
        
    }
    
}
