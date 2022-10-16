import React from 'react'
import { Knowledge } from '../models/Knowledge'

type KnowledgesViewProps = {
    knowledges: Array<Knowledge> | undefined
}

const KnowledgesView = ({ knowledges }: KnowledgesViewProps) => {
    return (
        <section id="conhecimentos" className="secao-doc">
            <h2>Conhecimentos</h2>
            {
                knowledges?.map(knowledge => (
                    <span key={knowledge.id}>{knowledge.knowledge}</span>
                ))
            }
        </section>
    )
}

export default KnowledgesView