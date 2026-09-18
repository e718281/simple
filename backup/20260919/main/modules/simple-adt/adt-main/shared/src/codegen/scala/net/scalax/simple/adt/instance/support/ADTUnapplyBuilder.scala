
    package net.scalax.simple.adt
    package instance
    package support

    trait ADTUnapplyBuilder {
      
      trait ADTOptionsUnapply1 {
        
            def unapply[T1](
              p: CoProduct1[T1]
            ): Some[T1] = Some(p.value)
          

            def unapply[T1,T2](
              p: CoProduct2[T1,T2]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3](
              p: CoProduct3[T1,T2,T3]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4](
              p: CoProduct4[T1,T2,T3,T4]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5](
              p: CoProduct5[T1,T2,T3,T4,T5]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6](
              p: CoProduct6[T1,T2,T3,T4,T5,T6]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7](
              p: CoProduct7[T1,T2,T3,T4,T5,T6,T7]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8](
              p: CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9](
              p: CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
              p: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T1] = UnapplyBuilderHelper[T1].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply2 {
        
            def unapply[T1,T2](
              p: CoProduct2[T1,T2]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3](
              p: CoProduct3[T1,T2,T3]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4](
              p: CoProduct4[T1,T2,T3,T4]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5](
              p: CoProduct5[T1,T2,T3,T4,T5]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6](
              p: CoProduct6[T1,T2,T3,T4,T5,T6]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7](
              p: CoProduct7[T1,T2,T3,T4,T5,T6,T7]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8](
              p: CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9](
              p: CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
              p: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T2] = UnapplyBuilderHelper[T2].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply3 {
        
            def unapply[T1,T2,T3](
              p: CoProduct3[T1,T2,T3]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4](
              p: CoProduct4[T1,T2,T3,T4]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5](
              p: CoProduct5[T1,T2,T3,T4,T5]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6](
              p: CoProduct6[T1,T2,T3,T4,T5,T6]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7](
              p: CoProduct7[T1,T2,T3,T4,T5,T6,T7]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8](
              p: CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9](
              p: CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
              p: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T3] = UnapplyBuilderHelper[T3].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply4 {
        
            def unapply[T1,T2,T3,T4](
              p: CoProduct4[T1,T2,T3,T4]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5](
              p: CoProduct5[T1,T2,T3,T4,T5]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6](
              p: CoProduct6[T1,T2,T3,T4,T5,T6]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7](
              p: CoProduct7[T1,T2,T3,T4,T5,T6,T7]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8](
              p: CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9](
              p: CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
              p: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T4] = UnapplyBuilderHelper[T4].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply5 {
        
            def unapply[T1,T2,T3,T4,T5](
              p: CoProduct5[T1,T2,T3,T4,T5]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6](
              p: CoProduct6[T1,T2,T3,T4,T5,T6]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7](
              p: CoProduct7[T1,T2,T3,T4,T5,T6,T7]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8](
              p: CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9](
              p: CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
              p: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T5] = UnapplyBuilderHelper[T5].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply6 {
        
            def unapply[T1,T2,T3,T4,T5,T6](
              p: CoProduct6[T1,T2,T3,T4,T5,T6]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7](
              p: CoProduct7[T1,T2,T3,T4,T5,T6,T7]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8](
              p: CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9](
              p: CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
              p: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T6] = UnapplyBuilderHelper[T6].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply7 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7](
              p: CoProduct7[T1,T2,T3,T4,T5,T6,T7]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8](
              p: CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9](
              p: CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
              p: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T7] = UnapplyBuilderHelper[T7].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply8 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8](
              p: CoProduct8[T1,T2,T3,T4,T5,T6,T7,T8]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9](
              p: CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
              p: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T8] = UnapplyBuilderHelper[T8].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply9 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9](
              p: CoProduct9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
              p: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T9] = UnapplyBuilderHelper[T9].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply10 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](
              p: CoProduct10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T10] = UnapplyBuilderHelper[T10].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply11 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](
              p: CoProduct11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T11] = UnapplyBuilderHelper[T11].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply12 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](
              p: CoProduct12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T12] = UnapplyBuilderHelper[T12].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply13 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](
              p: CoProduct13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
            ): Option[T13] = UnapplyBuilderHelper[T13].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T13] = UnapplyBuilderHelper[T13].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T13] = UnapplyBuilderHelper[T13].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T13] = UnapplyBuilderHelper[T13].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T13] = UnapplyBuilderHelper[T13].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T13] = UnapplyBuilderHelper[T13].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T13] = UnapplyBuilderHelper[T13].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T13] = UnapplyBuilderHelper[T13].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T13] = UnapplyBuilderHelper[T13].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T13] = UnapplyBuilderHelper[T13].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply14 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](
              p: CoProduct14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
            ): Option[T14] = UnapplyBuilderHelper[T14].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T14] = UnapplyBuilderHelper[T14].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T14] = UnapplyBuilderHelper[T14].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T14] = UnapplyBuilderHelper[T14].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T14] = UnapplyBuilderHelper[T14].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T14] = UnapplyBuilderHelper[T14].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T14] = UnapplyBuilderHelper[T14].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T14] = UnapplyBuilderHelper[T14].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T14] = UnapplyBuilderHelper[T14].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply15 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](
              p: CoProduct15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
            ): Option[T15] = UnapplyBuilderHelper[T15].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T15] = UnapplyBuilderHelper[T15].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T15] = UnapplyBuilderHelper[T15].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T15] = UnapplyBuilderHelper[T15].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T15] = UnapplyBuilderHelper[T15].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T15] = UnapplyBuilderHelper[T15].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T15] = UnapplyBuilderHelper[T15].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T15] = UnapplyBuilderHelper[T15].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply16 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](
              p: CoProduct16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
            ): Option[T16] = UnapplyBuilderHelper[T16].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T16] = UnapplyBuilderHelper[T16].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T16] = UnapplyBuilderHelper[T16].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T16] = UnapplyBuilderHelper[T16].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T16] = UnapplyBuilderHelper[T16].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T16] = UnapplyBuilderHelper[T16].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T16] = UnapplyBuilderHelper[T16].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply17 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](
              p: CoProduct17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
            ): Option[T17] = UnapplyBuilderHelper[T17].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T17] = UnapplyBuilderHelper[T17].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T17] = UnapplyBuilderHelper[T17].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T17] = UnapplyBuilderHelper[T17].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T17] = UnapplyBuilderHelper[T17].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T17] = UnapplyBuilderHelper[T17].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply18 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](
              p: CoProduct18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
            ): Option[T18] = UnapplyBuilderHelper[T18].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T18] = UnapplyBuilderHelper[T18].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T18] = UnapplyBuilderHelper[T18].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T18] = UnapplyBuilderHelper[T18].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T18] = UnapplyBuilderHelper[T18].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply19 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](
              p: CoProduct19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
            ): Option[T19] = UnapplyBuilderHelper[T19].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T19] = UnapplyBuilderHelper[T19].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T19] = UnapplyBuilderHelper[T19].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T19] = UnapplyBuilderHelper[T19].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply20 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](
              p: CoProduct20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]
            ): Option[T20] = UnapplyBuilderHelper[T20].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T20] = UnapplyBuilderHelper[T20].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T20] = UnapplyBuilderHelper[T20].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply21 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](
              p: CoProduct21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21]
            ): Option[T21] = UnapplyBuilderHelper[T21].take(UnapplyBuilderHelper.toValue(p))
          

            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T21] = UnapplyBuilderHelper[T21].take(UnapplyBuilderHelper.toValue(p))
          
      }
    

      trait ADTOptionsUnapply22 {
        
            def unapply[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](
              p: CoProduct22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22]
            ): Option[T22] = UnapplyBuilderHelper[T22].take(UnapplyBuilderHelper.toValue(p))
          
      }
    
    }
  