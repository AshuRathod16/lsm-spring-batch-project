package com.bridgelabz.lmsspringbatchproject.config;

import com.bridgelabz.lmsspringbatchproject.entity.Candidates;
import org.springframework.batch.item.ItemProcessor;


public class CandidateProcessor implements ItemProcessor<Candidates, Candidates> {

    @Override
//    public Candidates process(Candidates candidates) throws Exception {
//        if (candidates.getCandidateStatus().equals("complete")) {
//            return candidates;
//        } else {
//            return null;
//        }
 //   }
    public Candidates process(Candidates candidates) throws Exception {
        //   if(candidateModel.getCountry().equals("United States")) {
        return candidates;
        //    }else{
        //       return null;
        //  }
    }
}
