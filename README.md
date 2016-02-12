<center><h1> Text analysis </h1></center>

<b> Framework Hadoop </b> <br>
All programmed task use this framework, because it allows for the distributed processing of large data sets across clusters of computers using simple programming models. It is designed to scale up from single servers to thousands of machines, each offering local computation and storage. Rather than rely on hardware to deliver high-availability, the library itself is designed to detect and handle failures at the application layer, so delivering a highly-available service on top of a cluster of computers, each of which may be prone to failures.

<p align='center'>
<img src="https://github.com/JiriCagis/HadoopLearn/blob/master/images/Hadoop_elephants.jpg"/>
</p>

<h3> Word counter </h3>
This example show as hadoop framework working. Hadoop use mapreduce algorithm than divide task to dwo part.
In first part map algorithm go through all lines text and individually word save to map and second part reduce algorithm sum occurrence word in  text.
<div>
<b>Example:</b><br>
- <u> Mapper </u><br> INPUT: ahoj svete ahoj svete <br>OUTPUT: [ahoj,1] [svete,1] [ahoj,1] <br>
- <u> Reducer</u><br>INPUT: [ahoj,1,1] <br> OUTPUT: [ahoj,2] <br>
</div>

<h3> Inverted Indexing </h3>
Algorithm is use for find out count occurrence words in many text documents.
It produce list words with information about totally occurrence in all documents and individually occurrence for concrete document. A goal of a this implementation is to optimize the speed of the query: find the documents where word X occurs. You can use for base full-text search engine.
<div>
<b>Example:</b> <br>
<PRE>
INPUT:
1: if you prick us do we not bleed <BR>
2: if you tickle us do we not laugh <BR>
3: if you poison us do we not die and <BR>
4: if you wrong us shall we not revenge <BR>
</PRE>
<PRE>
OUTPUT: 
and     : 1 : (3, 1) 
bleed   : 1 : (1, 1)
die     : 1 : (3, 1)
do      : 3 : (1, 1), (2, 1), (3, 1)
if      : 4 : (1, 1), (2, 1), (3, 1), (4, 1)
laugh   : 1 : (2, 1)
not     : 4 : (1, 1), (2, 1), (3, 1), (4, 1)
poison  : 1 : (3, 1)
prick   : 1 : (1, 1)
revenge : 1 : (4, 1)
shall   : 1 : (4, 1)
tickle  : 1 : (2, 1)
us      : 4 : (1, 1), (2, 1), (3, 1), (4, 1)
we      : 4 : (1, 1), (2, 1), (3, 1), (4, 1)
wrong   : 1 : (4, 1)
you     : 4 : (1, 1), (2, 1), (3, 1), (4, 1)
</PRE>
<div>
<b>Explanation:</b> First number present totally count occurence of all documents. Braces contains two numbers, 
left number mean number document and right number is occurence in this document.
</div>


</div>

