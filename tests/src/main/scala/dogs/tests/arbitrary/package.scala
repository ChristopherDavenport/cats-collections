package dogs.tests

package object arbitrary {
  object all extends AllArbitrary

  object dlist extends ArbitraryDList
  object list extends ArbitraryList
  object option extends ArbitraryOption
  object streaming extends ArbitraryStreaming
}
